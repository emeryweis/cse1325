public class Product {

   public Product (String name, int price) {
      if (price < 0) {
        throw new IllegalArgumentException("Inavlid price of " + name + ": " + price);
      }

      this.stockNumber = nextStockNumber;
      nextStockNumber++;
      this.name = name;
      this.price = price;
   }

   public int getStockNumber(){
      return stockNumber;
   }

   public int getPrice(){
      return price;
   }
   
   @Override
   public String toString(){
      return String.format ("%-30s $ %3.2f", name, price);
   }
   
    private static int nextStockNumber = 0;
    private int stockNumber;
    private String name;
    private int price;
}
