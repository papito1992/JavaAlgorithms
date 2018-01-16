package JavaMaster.Arrays.NumberSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
//Integer []shittest= {465,465,46,54,3,1,144,43,23,8,55,123,69};
//        for (int i = 0; i < shittest.length; i++)
//            System.out.print(shittest[i]+"  ");
//        System.out.print("DONE");
//        Arrays.sort(shittest);
//        for (int i = 0; i < shittest.length; i++)
//            System.out.print(shittest[i]+"  ");
//        System.out.print("DONE");
//        System.out.print("REVERSING NOW");
//        List<Integer> list= Arrays.asList(shittest);
//        Collections.reverse(list);
//        System.out.println(list);
//        inputingshit(sendInts(5));

        sortIntegers(sendInts(5));
    }
    public static int[] sortIntegers(int[] array){
//        int [] sortArray= new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortArray[i]=array[i];
//            }

            //OPTIONAL< OPTIMIZED >
        int [] sortArray= Arrays.copyOf(array,array.length);
            boolean check= true;


        int temp;
        while (check){
            check= false;
            for (int i = 0; i < sortArray.length-1; i++) {
                if (sortArray[i]<sortArray[i+1])
                {temp=sortArray[i];
                sortArray[i]=sortArray[i+1];
                    sortArray[i+1]=temp;
                    check= true;
                }
            }
            System.out.println(Arrays.toString(sortArray));
        }
    return sortArray;}
//    private static void inputingshit(int[] shitalot){
////         Scanner scanner= new Scanner(System.in);
////        for (int i = 0; i < fill_this_UP.length; i++) {
////            fill_this_UP[i]=scanner.nextInt();
////        }
//        for (int i = 0; i < shitalot.length; i++)
//            System.out.print(shitalot[i]+"  ");
//        System.out.print("DONE");
//        Arrays.sort(shitalot);
//        for (int i = 0; i < shitalot.length; i++)
//            System.out.print(shitalot[i]+"  ");
//        System.out.print("DONE");
//        System.out.print("REVERSING NOW");
//        List<int[]> list= Arrays.asList(shitalot);
//        Collections.reverse(list);
//        list.stream().forEach(System.out::println);
//    }
//
//
    private static int[] sendInts(int ass){
        Scanner scanner= new Scanner(System.in);
        int[] values= new int[ass];
        for (int i = 0; i <values.length ; i++) {
            values[i]=scanner.nextInt();

        }return values;

    }

}
