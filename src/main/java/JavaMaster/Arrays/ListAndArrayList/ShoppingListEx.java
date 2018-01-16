package JavaMaster.Arrays.ListAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingListEx {
   private static Scanner scanner= new Scanner(System.in);
    private static GroceryList groceryList= new GroceryList();

    public static void main(String[] args) {

        boolean quit= false;
        int choice= 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: " );
            choice=scanner.nextInt();
            switch (choice){

                case 1:
                    printInstructions();
                    break;
                case 2: groceryList.addGroceryItem(scanner.next());
                break;
                case 3:
                    groceryList.removeGroceItemWiString(scanner.next());
                    break;
                case 4:
                    groceryList.onFIle(scanner.next());
                    break;
                case 5:
                    groceryList.printArray();
                    break;
                case 6:
                    groceryList.modGroceryByString(scanner.next(), scanner.next());
                    break;
                case 7:
                    quit=true;
                    break;

            }

        }
    }

    private static void printInstructions() {
        System.out.println("1: print instructions for Item management");
        System.out.println("2: add Item");
        System.out.println("3: del Item");
        System.out.println("4: find Item");
        System.out.println("5: print all Items");
        System.out.println("6: mod Item");
        System.out.println("7: quit shopping");
    }
    // kopijavimo arraylist budai

    private static void precessArrayList(){
        ArrayList<String> newArray= new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray= new ArrayList<>(groceryList.getGroceryList());

        String[] myArray= new String[groceryList.getGroceryList().size()];
        myArray= groceryList.getGroceryList().toArray(myArray);



    }

}
