package JavaMaster.OverloadedMetodai;

public class task {
    public static void main(String[] args) {
calcFeetAndInchesToCms(10,6);
calcFeetAndInchesToCms(11);
    }
    public static double  calcFeetAndInchesToCms(double feet, double inches){
        if (feet<=0 || (inches<0 && inches>=12)){
            System.out.println("Bad input");
            return -1;
        }
       double inches1=2.54;

double feetToCms=feet*12*inches1;
double inchesToCms=inches1*inches;

double result=feetToCms+inchesToCms;
        System.out.println(feetToCms+" + "+inchesToCms+" total= "+result);
return result;    }
    public static double  calcFeetAndInchesToCms(double inches){
        if ( inches<0){
            System.out.println("Bad input");
            return -1;
        }
        double inches1=2.54;


        double inchesToCms=inches1*inches;
        System.out.println(+inchesToCms);
        double result=inchesToCms;

        return result;    }

}
