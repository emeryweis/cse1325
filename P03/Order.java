import java.util.ArrayList;

public class Order {

    public Order(Customer customer) {
        this.customer = customer;
        orderNumber = nextOrderNumber;
        nextOrderNumber++;
        

    }

    public void addItem(Item item) {

    }

    public int getPrice() {
        
    }

    @Override 
    public String toString() {

    }

    private static int nextOrderNumber = 1;
    private int orderNumber;
    private ArrayList<Item> item;
    private Customer customer;
}
