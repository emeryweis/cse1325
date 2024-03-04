package store;

/*  
    Copyright 2024 by Professor George F. Rice, modifications copyright 2024 by Emery Weis
    This program is free software: you can redistribute it and/or modify it 
    under the terms of the GNU General Public License as published 
    by the Free Software Foundation, either version 3 of the License, 
    or (at your option) any later version.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;


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

    public Store(BufferedReader br) throws IOException {
        this.name = br.readLine();
    }

    public void save(BufferedWriter bw) throws IOException {
        bw.write(name + "\n");
        bw.write("Number of customers" + customers.size() + "\n");
        for (Customer c : customers) bw.write("" + c.toString() + "\n");
    }
}
