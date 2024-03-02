package mdi;

public enum View {
    CUSTOMERS, ORDERS, PRODUCTS;
    private static String[] views = new String[]{"Customers", "Orders", "Products"};
    @Override
    public String toString() {
        return views[this.ordinal()];
    }
}
