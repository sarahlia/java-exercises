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
                    processArrayList();
                    break;
                case 7:
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
        System.out.println("\t 6 - Print the ArrayList.");
        System.out.println("\t 7 - Quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        gl.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Current item name: ");
        String itemNumber = scanner.nextLine();
        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine();
        gl.modifyGroceryItem(itemNumber, newItem );
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemNumber = scanner.nextLine();
        gl.removeGroceryItem(itemNumber);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if( gl.onFile(searchItem) ) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + " is NOT found.");
        }
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return this.groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) +". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);

        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);

        if(position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);

        if(position >= 0) {
            return true;
        }

        return false;
    }

    public static void processArrayList() {
//        ArrayList<String> newArray = new ArrayList<>();
//        newArray.addAll(gl.getGroceryList());//one way to copy an array list (in this case: gl)

        ArrayList<String> nextArray = new ArrayList<>(gl.getGroceryList()); //another way to copy an array list

//        String[] myArray = new String[gl.getGroceryList().size()];
//        myArray = gl.getGroceryList().toArray(myArray); //yet another way to copy an array list.
        System.out.println(nextArray);
    }
}
