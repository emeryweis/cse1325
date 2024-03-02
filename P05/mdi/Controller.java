package mdi;

import store.Store;
import store.Customer;
import store.Item;
import store.Order;
import store.Product;
import store.Tool;
import store.Plant;
import store.Exposure;

import java.util.Scanner;

public class Controller {
    private Store store;
    private View view;
    private Menu mainMenu;
    private String output;
    private boolean isRunning;
    private Scanner in;

    public Controller(String storeName){
        this.store = new Store(storeName);
        this.view = View.CUSTOMERS;
        this.isRunning = true;
        this.output = "";

        this.in = new Scanner(System.in);

        mainMenu = new Menu();

        mainMenu.addMenuItem(new MenuItem("Exit",               () -> exit()));
        mainMenu.addMenuItem(new MenuItem("Place order",        () -> placeOrder()));
        mainMenu.addMenuItem(new MenuItem("Add a customer",     () -> newCustomer()));
        mainMenu.addMenuItem(new MenuItem("Add a tool",         () -> newTool()));
        mainMenu.addMenuItem(new MenuItem("Add a plant",        () -> newPlant()));
        mainMenu.addMenuItem(new MenuItem("Change view",        () -> switchView()));
    }

    public void mdi() {
        Integer selection = null;
        while(isRunning) {
            try {
                selection = selectFromMenu();
                output = "";
                if (selection == null) continue;
                if (selection == -1) testData();
                else mainMenu.run(selection);
            } catch(Exception e) {
                print("#### Error: " + e.getMessage());
            }
        }
    }

    private void exit(){
        isRunning = false;
    }

    private void placeOrder() {
        System.out.println("\nPlacing an Order\n----------------\n");
        int customer = getInt("\n" + store.getCustomerList() + "\nWhich customer? ");
        if (customer < 0) return;
        int order = store.newOrder(customer);
        while (true) {
            int product = getInt("\n" + store.getProductList() + 
                                "\nWhich product (-1 to complete order)?");
            if (product < 0) break;
            int quantity = getInt("How many (-1 to select a different product)? ");
            if (quantity > 0) continue;
            store.addToOrder(order, product, quantity);
        }
        print("Created Order " + order);
        view = View.ORDERS;
    }

    private void newCustomer() {
        System.out.println("\nDefining a new Customer\n-----------------------\n");
        String name = getString("New customers name:    ");
        String email = getString("New customers email:      ");
        Customer customer = new Customer(name, email);
        store.addCustomer(customer);
        print("Created new customer: " + customer);
        view = View.CUSTOMERS;
    }

    private void newTool() {
        System.out.println("\nDefining a new Tool\n-------------------\n");
        String name = getString("New tool name:     ");
        double price = getDouble("New tool price:      ");
        Tool tool = new Tool(name, (int) (price*100));
        store.addProduct(tool);
        print("Created new tool: " + tool);
        view = View.PRODUCTS;
    }

    private void newPlant() {
        System.out.println("\nDefining a new Plant\n-------------------\n");
        String name = getString("New plant name:    ");

        Exposure exposure = null;
        try{
            System.out.println();
            for (Exposure ex : Exposure.values()) {
                System.out.println(ex.ordinal() + "] " + ex);
            }
            int selection = getInt("\nNew plant's exposure? ");
            exposure = Exposure.values()[selection];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Invalid Exposure");
        }

        double price = getDouble("New plants price:     ");
        Plant plant = new Plant(name, exposure, (int) (price*100));
        store.addProduct(plant);
        print("Created new plant: " + plant);
        view = View.PRODUCTS;
    }

    private void switchView() {
        System.out.println("\nSwitching View\n--------------\n");
        for (View view : View.values()) {
            System.out.println(view.ordinal() + "] " + view);
        }
        int selection = getInt("\nSelection? ");
        view = View.values()[selection];
        print("Switched view to " + view);
    }



    private String getView() {
        String result = "INVALID VIEW";
        if (view == View.CUSTOMERS) result = store.getCustomerList();
        if (view == View.PRODUCTS) result = store.getProductList();
        if (view == View.ORDERS) result = store.getOrderList();
        return result;
    }

    private static final String clearScreen = "\n".repeat(255);
    private Integer selectFromMenu() {
        System.out.println(clearScreen
                        + store.getName() + "Main Menu\n\n"
                        + mainMenu + "\n"
                        + getView() + "\n"
                        + output + "\n");
        output = "";
        return getInt("Selection? ");
    }

    private void print(String s) {
        output += s + "\n";
    }

    private String getString(String prompt) {
        String s = null;
        while(true) {
            try {
                System.out.print(prompt);
                s = in.nextLine().trim();
                break;
            } catch(Exception e) {
                System.err.println("Invalid input!"); 
            }
        }
        return s;
    }

    private Integer getInt(String prompt) {
        Integer i = null;
        while(true) {
            try {
                String s = getString(prompt);
                if (s != null && !s.isEmpty()) i = Integer.parseInt(s);
                break;
            } catch(Exception e) {
                System.err.println("Invalid input!");
            }
        }
        return i;
    }

    private Double getDouble(String prompt) {
        Double d = null;
        while(true) {
            try {
                String s = getString(prompt);
                if (s != null && !s.isEmpty()) d = Double.parseDouble(s);
                break;
            } catch(Exception e) {
                System.err.println("Invalid input!");
            }
        }
        return d;
    }

    public void testData() {
        Customer c1 = new Customer("Prof Rice", "george.rice@uta.edu");
        Customer c2 = new Customer("President Joe Biden", "president@whitehouse.gov");
        Customer c3 = new Customer("The Late Queen Elizabeth II", "queen@royal.gov.uk");
        Customer c4 = new Customer("Mark Zuckerberg", "mark.zuckerberg@facebook.com");
        store.addCustomer(c1);
        store.addCustomer(c2);
        store.addCustomer(c3);
        store.addCustomer(c4);

        Product p1 = new Plant("Cactus Cereus Peruvianus", Exposure.SUN, 4990);
        Product p2 = new Plant("'White Princess' Philodendron", Exposure.PARTSUN, 5500);
        Product p3 = new Tool("Bypass Pruners", 2299);
        Product p4 = new Tool("Large Gardener's Cart", 34900);
        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);
        store.addProduct(p4);
        
        int order = store.newOrder(0);
        store.addToOrder(order, 0, 4);
        store.addToOrder(order, 1, 3);
        store.addToOrder(order, 2, 2);
        store.addToOrder(order, 3, 1);

        Item i1 = new Item(p1, 4);
        Item i2 = new Item(p2, 3);
        Item i3 = new Item(p3, 2);
        Item i4 = new Item(p4, 1);

        Order o1 = new Order(c1);
        o1.addItem(i1);
        o1.addItem(i2);
        o1.addItem(i3);
        o1.addItem(i4);
    }

}
