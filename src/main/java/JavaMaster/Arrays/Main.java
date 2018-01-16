package JavaMaster.Arrays;



import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {System.out.println("set how many numbers there will be in an array ");
//        int[] myInts= getInts(5);
//        getIntss(5);
        int[] shitbolz= getIntss(5);
//        averagerMachiner(shitbolz);
//        readArray(shitbolz);
        sorterOfRays(shitbolz);
    }

    private static int[] getInts(int number) {
        double currentAverage=0;

        double total=0;

        int[] myInput= new int[number+1];

        for (int i = 1; i < myInput.length; i++) {
            System.out.println("enter a number at position : " +(i));

            myInput[i]= scanner.nextInt();
            total+=myInput[i];

          currentAverage=total/i;

            System.out.println("total : " +total +" , average " +currentAverage);
        }
        System.out.println(" total average :" +currentAverage + " total sum: " +total);

        return myInput;
    }

private static void readArray(int[] array){
    for (int i = 0; i < array.length; i++) {
        System.out.println("number " +array[i]);
    }
//    for (int i :
//            array) {
//        System.out.println("number " +array[i]);
//    }
}
    private static int[] getIntss(int ass){

        int[] values= new int[ass];
        for (int i = 0; i <values.length ; i++) {
            values[i]=scanner.nextInt();

        }return values;

    }
    private static double averagerMachiner(int[] array){
int total=0;
int average=0;
        for (int i = 0; i < array.length; i++) {
            total+=array[i];

        }
        System.out.println(total/array.length);

    return average;}
    private static int[] sorterOfRays(int[] array){
        System.out.println("unseroted array");
        for (int i = 0; i < array.length; i++) {
            System.out.println("number " +array[i]);
        }
        System.out.println("sorted array");
        int[] sortedArray=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i]=array[i];
        }
//        List<int[]> list = Arrays.asList(sortedArray);
//        Collections.reverse(list);
//        System.out.println(list);
//      Arrays.sort(array);

        System.out.println(Arrays.toString(array));
      for (int i = 0; i < array.length; i++) {
            System.out.println("number " +array[i]);
        }
    return array;}
}
