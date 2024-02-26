package store;

import java.util.ArrayList;
import menu.Menu;
import menu.MenuItem;


public class Store {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private ArrayList<Product> products = new ArrayList<Product>();
    private ArrayList<Order> orders = new ArrayList<Order>();

    public Store(String name) {

    }
    public String getName() {
        return name;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public String getCustomerList() {
        for (int i = 0; i < customers.size(); i++) {
            MenuItem customerMenu = new MenuItem(customers.get(i), ) 
        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }
    public String getProductList() {
        for (int i = 0; i < products.size(); i++) {
            return String.format("%d %s", i, products.get(i));
        }
    }

    public int newOrder(int customerIndex) {
        Order s = new Order(customers(customerIndex));
    }
    public void addToOrder(int orderIndex, int productIndex, int quantity) {

    }
    public String getOrderList() {

    }
}
