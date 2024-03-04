package store;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public abstract class Product {

   public Product (String name, int price) {
      if (price < 0) {
        throw new IllegalArgumentException("Inavlid price of " + name + ": " + (double)price/100);
      }

      this.stockNumber = nextStockNumber;
      nextStockNumber++;
      this.name = name;
      this.price = price;
   }

   public Product(BufferedReader br) throws IOException {
      this.name = br.readLine();
      this.price = Integer.parseInt (br.readLine());
   }

   public void save(BufferedWriter bw) throws IOException {
      bw.write(name + "\n");
      bw.write(price + "\n");
   }

   public int getStockNumber(){
      return stockNumber;
   }

   public int getPrice(){
      return price;
   }
   
   @Override
   public String toString(){
      return String.format ("%-30s $   %5.2f", name, (double)price/100);
   }
   
    private static int nextStockNumber = 0;
    private int stockNumber;
    protected String name;
    protected int price;
}
