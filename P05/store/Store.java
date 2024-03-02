package store;

import java.util.ArrayList;

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
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < customers.size(); i++) {
            sb.append(String.format("%3d] %s\n", i, customers.get(i)));
        }
        return sb.toString();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
    public String getProductList() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < products.size(); i++) {
            sb.append(String.format("%3d] %s\n", i, products.get(i)));
        }
        return sb.toString();
    }

    public int newOrder(int customerIndex) {
        orders.add(new Order(customers.get(customerIndex)));
        return orders.size() - 1;
    }
    public void addToOrder(int orderIndex, int productIndex, int quantity) {
        orders.get(orderIndex).addItem(new Item(products.get(productIndex), quantity));
    }
    public String getOrderList() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < orders.size(); i++) {
            sb.append(String.format("\n%s\n", orders.get(i)));
        }
        return sb.toString();
    }
}
