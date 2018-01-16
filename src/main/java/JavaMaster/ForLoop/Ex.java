package JavaMaster.ForLoop;

public class Ex {
    public static void main(String[] args) {

        int count=0;
        for (int i = 10; i <50 ; i++) {
            if (isPrime(i)){
                count++;
                System.out.println("Number " +i +" is a prime number, we got that butch");
                if (count == 10){
                    System.out.println("To mny blacks, im leaving ");
                    break;
                }
            }
        }
    }


    public static boolean isPrime(int n){
        if (n==1){
          return false;
        }
        for (int i=2;i<=Math.sqrt(n); i++){
            if (n % i ==0){
                return false;
            }
        }
    return true;}
}
