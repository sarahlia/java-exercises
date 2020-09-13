package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList gl = new GroceryList();

    public static void main(String[] args) {
//        GroceryList g = new GroceryList();
//        g.addGroceryItem("milk");
//        g.addGroceryItem("banana");
//        g.printGroceryList();
//        g.removeGroceryItem(0);
//        g.printGroceryList();
//        g.modifyGroceryItem(1, "cookies");
//        g.printGroceryList();
//        System.out.println("g.findItem(\"beer\") = " + g.findItem("beer"));

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: " );
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    gl.printGroceryList();
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
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - Show options.");
        System.out.println("\t 1 - Print the list of grocery items.");
        System.out.println("\t 2 - Add an item to the list.");
        System.out.println("\t 3 - Modify an item in the list.");
        System.out.println("\t 4 - Remove an item from the list.");
        System.out.println("\t 5 - Search for an item in the list.");
        System.out.println("\t 6 - Quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        gl.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        gl.modifyGroceryItem(itemNumber-1, newItem );
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        gl.removeGroceryItem(itemNumber-1);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(gl.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in the grocery list.");
        } else {
            System.out.println(searchItem + " is NOT found.");
        }
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) +". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);

        if(position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
