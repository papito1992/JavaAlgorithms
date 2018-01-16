package JavaMaster.Arrays.GroceryList;

import java.util.ArrayList;


public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }


    public void modGroceryByString(String name){
        int position= findItem(name);
        if (position>=0){
            groceryList.set(position,name);
        }
    }
public void removeGroceItemWiString(String itemName){
   int position= findItem(itemName);
   if (position>=0){
       removeGroceryItem(position);
   }
}
    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public int findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);
//
//        int position = groceryList.indexOf(searchItem);
//        if(position >=0) {
//            return groceryList.get(position);
//        }
//
//        return null;
        return groceryList.indexOf(searchItem);
    }
}
