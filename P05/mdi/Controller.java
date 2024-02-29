package mdi;

import store.Store;
import store.Customer;
import store.Item;
import store.Order;
import store.Product;
import store.Tool;
import store.Plant;
import store.Exposure;

import java.util.Scanner;

public class Controller {
    private Store store;
    private View view;
    private Menu mainMenu;
    private String output;
    private boolean isRunning;
    private Scanner in;

    public Controller(String storeName){
        this.store = new Store(storeName);
        this.view = View.CUSTOMERS;
        this.isRunning = true;
        this.output = "";

        this.in = new Scanner(System.in);

        mainMenu = new Menu();

        mainMenu.addMenuItem(new MenuItem("Exit",               () -> exit()));
        mainMenu.addMenuItem(new MenuItem("Place order",        () -> placeOrder()));
        mainMenu.addMenuItem(new MenuItem("Add a customer",     () -> newCustomer()));
        mainMenu.addMenuItem(new MenuItem("Add a tool",         () -> newTool()));
        mainMenu.addMenuItem(new MenuItem("Add a plant",        () -> newPlant()));
        mainMenu.addMenuItem(new MenuItem("Change view",        () -> switchView()));
    }

    public void mdi() {
        Integer selection = null;
        while(isRunning) {
            try {
                selection = selectFromMenu();
                output = "";
                if (selection == null) continue;
                if (selection == -1) testData();
                else mainMenu.run(selection);
            } catch(Exception e) {
                print("#### Error: " + e.getMessage());
            }
        }
    }

    private void exit(){
        isRunning = false;
    }
    private void placeOrder() {

    }
    private void newCustomer() {

    }
    private void newTool() {

    }
    private void newPlant() {

    }
    private void switchView() {

    }


    private String getView() {

    }
    private ArrayList<Integer> selectFromMenu() {

    }
    private void print(String s) {

    }
    private void getString(String prompt) {

    }
    private ArrayList<Integer> getInt(String prompt) {

    }
    private ArrayList<Double> getDouble(String prompt) {

    }

}
