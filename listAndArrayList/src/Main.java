import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstrunctions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstrunctions();
                    break;
                case 1:
                    printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstrunctions() {

        System.out.println("\nPress ");
        System.out.println("0 - To print choice options.");
        System.out.println("1 - To print the list of grocery items.");
        System.out.println("2 - To add an item to the list.");
        System.out.println("3 - To modify an item in the list.");
        System.out.println("4 - To remove an item from the list.");
        System.out.println("5 - To search for an item in the list.");
        System.out.println("6 - To quite the application.");

    }

    public static void printGroceryList() {
        groceryList.printGroceryList();
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter current item to be replaced: ");
        String currentItem = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemToRemove = scanner.nextLine();
        groceryList.removeGroceryItem(itemToRemove);
    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list.");
        } else {
            System.out.println(searchItem + " is not in the grocery list.");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>(groceryList.getGroceryList());
    }

}
