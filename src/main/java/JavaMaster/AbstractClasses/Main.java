package JavaMaster.AbstractClasses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

SearchTree list=new SearchTree(null);

String stringdata="9 6 3 1 4 7 8 2 5 0 6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666";
String[] data=stringdata.split(" ");
        for (String s :
                data) {
            list.addItem(new Node(s));

        }

        list.traverse(list.getRoot());
        list.removeItem(list.getRoot());
        list.traverse(new Node(5));





    }

}
