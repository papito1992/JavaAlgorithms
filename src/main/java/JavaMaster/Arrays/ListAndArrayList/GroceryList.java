package JavaMaster.Arrays.ListAndArrayList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList= new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
//Prideti I ArrayList


    public void addGroceryItem(String item){
        groceryList.add(item);

    }
    //Atspausdinti ArrayList

    public void printArray(){
        System.out.println("Du hast :" +groceryList.size() + " items in your cart");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + " : " +groceryList.get(i));
        }
    }
    //Modifikiuoti ArrayList

   private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Item at position " +(position+1) +" was changed to :" +newItem);
    }
    public void modGroceryByString(String oldName,String newName){
        int position= findItem(oldName);
        if (position>=0){
            groceryList.set(position,newName);
        }}
    //Istrinti is ArrayList
    private void removeGroceryItem(int delItem){

        System.out.println(delItem);
        groceryList.remove(delItem);

    }
    public void removeGroceItemWiString(String itemName){
        int position= findItem(itemName);
        if (position>=0){
            removeGroceryItem(position);
        }
    }
    //Rasti ArrayListe
    private int findItem(String itemName){
        // reikia boolean, kad patikrintume ar egzistuoja

        return groceryList.indexOf(itemName);
    }
public boolean onFIle(String searchItem){
    int position= findItem(searchItem);
    if (position>=0){
        System.out.println("Found : " +searchItem);
        return true;
    }
    System.out.println("No such query found");
    return false;
}
}
