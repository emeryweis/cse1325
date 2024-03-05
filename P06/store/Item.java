package store;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Item {

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    } 

    public Item(BufferedReader br) throws IOException {
        this.quantity = Integer.parseInt (br.readLine());
    }

    public void save(BufferedWriter bw) throws IOException {
        bw.write(product + "\n");
        bw.write(quantity + "\n");
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
