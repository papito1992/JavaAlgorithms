package JavaMaster.isEvenNr;

public class Main {
    public static void main(String[] args) {
//        isEvenNr(5);
        int start=2;
        int finish=20;
        int increment=0;
//        while (start!=finish){
//            isEvenNr(start);
//
//            System.out.println("Dabartinis nr = " +start);
//            start++;
//            continue;
//        }
        while (start<=finish){
        while (increment!=5) {

            if (!isEvenNr(start)){
                start++;
                continue;
            }else {
                System.out.println("Lyginis skaicius : " +start);
                start++;
                increment++;
//                System.out.println("kiekis lyginiu skaiciu: " + increment);


                }
                if (increment>=5){
                    System.out.println("kiekis lyginiu skaiciu: " + increment);
                break;
                }
            }


        }
    }
    public static boolean isEvenNr(int nr){

        if (nr%2==0){
            System.out.println("lyginis");
            return true;
        }else {
            System.out.println("Nelyginis");
            return false;
        }
    }
}
