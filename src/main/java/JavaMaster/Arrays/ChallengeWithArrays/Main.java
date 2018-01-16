package JavaMaster.Arrays.ChallengeWithArrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
Utility utility= new Utility("5654665");
//utility.addContact("paul", 696969696);
//utility.addContact("tom", 696969696);
//utility.addContact("jol", 696969696);
//utility.addContact("steve", 696969696);
//utility.contactList();
//
//utility.removeContact("paul");
//
//        utility.contactList();
//        utility.search("jol");
//utility.modContactByString("tom");
//        utility.contactList();
        boolean quit= false;
        while (!quit){
            System.out.println("1 print \n 2 add \n 3 remove \n 4 update \n 5 search");
            int action = scanner.nextInt();
            scanner.nextLine();

        switch (action){
            case 1:
                utility.contactList69();
                break;
            case 2:
                utility.addContact();
                break;
            case 3:
//                utility.removeContact(new Scanner(System.in).nextLine());
                break;
            case 4:
                utility.modContactByString(new Scanner(System.in).nextLine());
                break;
            case 5:
                utility.search(new Scanner(System.in).nextLine());
                break;
            case 6:
                quit=true;
                break;
                default:
                    System.out.println("no such choice");
        }

    }}
}
