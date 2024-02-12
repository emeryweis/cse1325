package store;

import java.util.ArrayList;

public class Order {

    public Order(Customer customer) {
        this.customer = customer;
        orderNumber = nextOrderNumber;
        nextOrderNumber++;


    }

    public void addItem(Item item) {
        items.add(item);
    }

    public int getPrice() {
        return getPrice();
    }

    @Override 
    public String toString() {
        return String.format("Order " + orderNumber + " for " + customer + "\n" 
         + items + "\n"
        + "Order Total: " + getPrice());
    }

    private static int nextOrderNumber = 1;
    private int orderNumber;
    private ArrayList<Item> items;
    private Customer customer;
}
