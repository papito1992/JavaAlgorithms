package JavaMaster.Arrays.ChallengeWithArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Utility {
public String anynr;
   public ArrayList<Contact> myArrayList;

    public Utility(String anynr) {
        this.anynr = anynr;
        this.myArrayList = new ArrayList<Contact>();
    }

    public void printContacts() {
        System.out.println("Contact List");
        for(int i=0; i<this.myArrayList.size(); i++) {
            System.out.println((i+1) + "." +
                    this.myArrayList.get(i).getName() + " -> " +
                    this.myArrayList.get(i).getPhone());
        }

    }
//    private void addNumber(int number){
//        this.numberList.add(number);
//        System.out.println("number added");
//    }
//    private void addName(String name){
//        this.nameList.add(name);
//        System.out.println("name added");
//    }

    public boolean addContact(){
        Scanner scanner= new Scanner(System.in);
     //        myArrayList.add(contact);
//        System.out.println("contact added");
//        return true;
        System.out.println("Enter new contact name: ");
       String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        myArrayList.add(Contact.createContact(name, phone));
        if(findContact(name)>=0) {
            System.out.println("Cannot add, " + name + " already on file");
            return false;
        } else
        System.out.println("New contact added: name = " + name + ", phone = "+ phone);


        myArrayList.add(Contact.createContact(name, phone));

        return true;  }


    private int findContact(Contact contact) {
        return this.myArrayList.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i=0; i<this.myArrayList.size(); i++) {
            Contact contact = this.myArrayList.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
    //spausdinti
    public void contactList69(){
        System.out.println("dsewefefe");
        for(int i=0; i< this.myArrayList.size(); i++) {
//            System.out.println((i+1) + ". Number :" + numberList.get(i)+ " Name :" +nameList.get(i));
            System.out.println((i+1) + ". Number :" + this.myArrayList.get(i).getName()+ " Name :" +this.myArrayList.get(i).getPhone());
        }
    }
    //trinti
    public boolean removeContact(Contact contactName){
        int deleteContact= this.myArrayList.indexOf(contactName);
        if (findContact(contactName.getName())>=0){
        this.myArrayList.remove(deleteContact);
            System.out.println("deleted successfully");
            return true;
//        numberList.remove(deleteContact);
//        nameList.remove(deleteContact);
    } else System.out.println("Contact aint found");
        return false;
    }

    //tikrinti ar egzistuoja
    public boolean checkExistance(Contact searchItem){

        if (findContact(searchItem)>=0){
            System.out.println("Found : " +searchItem);
            return true;
        }
        System.out.println("No such query found");
        return false;
    }

    //ieskoti
    public boolean search(String searchItem){
        int position= findContact(searchItem);
        if (position>=0){
            System.out.println("Found : " +searchItem +" Number :" +myArrayList.get(position).getPhone());
            return true;
        }
        System.out.println("No such query found");
        return false;
    }
    //modifikuoti

//    public void modContactByString(Contact oldContact, Contact newContact){
//        int position= findContact(oldContact.name);
//        int oldnr=findContact(oldContact.phone);
//        if (position>=0){
//           this.myArrayList.set(position, newContact);
//        }
//       }

    public void modContactByString(String oldName){
        String tempOldName= oldName;
        int position= findContact(oldName);
//        int oldnr=numberList.get(position);
        Scanner scanner = new Scanner(System.in);
        if (position>=0){
            System.out.println("Input new name(1), number(2) or quit(3)");

//            nameList.set(position,scanner.nextLine());
//            numberList.set(position, scanner.nextInt());
            boolean quit= false;


while (!quit){
    System.out.println("enter your choice :");
    int switcher=scanner.nextInt();
    switch (switcher) {
        case 1:
            System.out.println("shit");
            System.out.println("enter new name : ");
            String newName = scanner.next();
//            nameList.set(position, newName);
            break;
        case 2:
            System.out.println("fuck");
            System.out.println("enter new number : ");
            int newNumber = scanner.nextInt();
//            numberList.set(position, newNumber);
            break;
        case 3:
            quit=true;
            break;
        default:
            System.out.println("No such option");

    }

}
//            if (scanner.nextLine().equals(""))
//                nameList.set(position,tempOldName);
//            if (scanner.nextInt(0)==0)
//                numberList.set(position,oldnr);
        } else System.out.println("no such name");


    }


}
