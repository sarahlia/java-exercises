package exercises;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public static void main(String[] args) {
        GroceryList g = new GroceryList();
        g.addGroceryItem("milk");
        g.addGroceryItem("banana");
        g.printGroceryList();
//        g.removeGroceryItem(0);
//        g.printGroceryList();
        g.modifyGroceryItem(1, "cookies");
        g.printGroceryList();
//        System.out.println("g.findItem(\"beer\") = " + g.findItem("beer"));

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
