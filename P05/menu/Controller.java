package menu;
import store.Store;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private Store store;
    private View view;
    private Menu mainMenu;
    private String output;
    private boolean isRunning = true;
    private Scanner in;

    public Controller(String storeName){
        Store s = new Store(storeName);
        this.output = "";
        this.mainMenu = new Menu();

        mainMenu.addMenuItem(new MenuItem("Add a customer",     () -> newCustomer()));
        mainMenu.addMenuItem(new MenuItem("Add a tool",         () -> newTool()));
        mainMenu.addMenuItem(new MenuItem("Add a plant",        () -> newPlant()));
    }
    public void mdi() {
        while (isRunning == true) {
            in = new Scanner(System.in);
            int selection = in.nextLine();
            mainMenu.run(in);
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
