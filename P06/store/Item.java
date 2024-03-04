package store;

public class Item {

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    } 
    
    int getPrice() {
        return quantity * product.getPrice();
    }

    @Override
    public String toString() {
        return String.format("%3d %-40s $ %-40d", quantity, product, getPrice());
    }

    private Product product;
    private int quantity;
}
