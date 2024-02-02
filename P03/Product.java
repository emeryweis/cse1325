public class Product {

   public Product product(String name, int price) {
      if (price < 0) {
        throw new IllegalArgumentException("Inavlid price of " + name + ": " + price);
      }

      this.name = name;
      this.price = price;

   }
   public int getStockNumber(){

   }
   public int getPrice(){

   }
   
   @Override
   public String toString(){

   }
   
    private static int nextStockNumber();
    private int stockNumber;
    private String name;
    private int price;
}
