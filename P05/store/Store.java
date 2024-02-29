package store;

import java.util.ArrayList;

import mdi.Menu;
import mdi.MenuItem;


public class Store {
    private String name;
    private ArrayList<Customer> customers;
    private ArrayList<Product> products;
    private ArrayList<Order> orders;

    public Store(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
        this.products = new ArrayList<>();
        this.orders = new ArrayList<>();

    }
    public String getName() {
        return name;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public String getCustomerList() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(i + " " + customers.get(i));
        }
        return customers.toString();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
    public String getProductList() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + " " + products.get(i));
        }
        return products.toString();
    }

    public int newOrder(int customerIndex) {
        Customer customer = customers.get(customerIndex);
        Order o = new Order(customer);
        orders.add(o);
        return orders.indexOf(o);
    }
    public void addToOrder(int orderIndex, int productIndex, int quantity) {
        Product p = products.get(productIndex);
        Item itm = new Item(p, quantity);
        Order(o).addItem(itm);
    }
    public String getOrderList() {
        for (int i = 0; i < orders.size(); i++) {
            System.out.println(i + " " + orders.get(i));
        }
        return orders.toString();
    }
}
