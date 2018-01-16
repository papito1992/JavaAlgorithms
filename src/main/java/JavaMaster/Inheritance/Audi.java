package JavaMaster.Inheritance;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Audi extends Car {
    int price;



    public  Audi(
                int wheelNumber, int doorNumber, int horsePower, int weight) {
        super( wheelNumber, doorNumber, horsePower, weight);
        Scanner scanner= new Scanner(System.in);
    getEnums();
    }

//        public static boolean contains(String test) {
//            Scanner scanner= new Scanner(System.in);
//            test=scanner.nextLine();
//
//            for (SteeringWheelPosition c : SteeringWheelPosition.values()) {
//
//
//                if (c.name().equals(test)) {
//                    System.out.println("valid type");
//                    return true;
//
//                }
//            }
//            System.out.println("non valid type");
//            return false;
//        }
//
public static HashSet<String> getEnums() {

    HashSet<String> values = new HashSet<String>();

    for (SteeringWheelPosition c : SteeringWheelPosition.values()) {
        values.add(c.name());
    }
    Scanner scanner= new Scanner(System.in);
   String test1=scanner.nextLine();
if (values.contains(test1)){
    System.out.println("valid type");
    return values;
}else {
    System.out.println("no such type");
}
 return values;
}
//if (SteeringWheelPosition.valueOf(new Scanner(System.in).nextLine()).equals((SteeringWheelPosition.values()))){
//    System.out.println("Valid steering type");
//}else {
//    System.out.println("the fuck is this");
//}
//    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
