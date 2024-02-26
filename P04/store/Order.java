/**
 * Creates a custom order.
 * 
 * @author              Emery David Weis
 * @version             0.2
 * @since               0.1
 * 
 */



package store;

import java.util.ArrayList;

public class Order {
    /**
     * @param customer      A customer from Customer.java
     * @since               0.1        
     */
    public Order(Customer customer) {
        this.customer = customer;
        orderNumber = nextOrderNumber;
        nextOrderNumber++;

    }
    /**
     * @param item          An item from Item.java
     * @since               0.1
     */
    public void addItem(Item item) {
        items.add(item);
    }
    
    public int getPrice() {
        int price = 0;
        for (Item item : items) {
            price += item.getPrice();
        }
        return price;
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
