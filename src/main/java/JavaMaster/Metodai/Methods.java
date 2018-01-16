package JavaMaster.Metodai;

public class Methods {
    public static void main(String[] args) {
//int highscoreposition=calculateHighScorePosition(1500);
displayHighScorePosition("Baggle", calculateHighScorePosition(1500));
    }
    public static void displayHighScorePosition(String playersName, int position){
        System.out.println(playersName +" " +"managed to get into position : "+position);
    }
    public static int calculateHighScorePosition(int score){

        if (score>=1000)
        {
            System.out.println("kek is harder than a 1000 rocks");
            return 1;
        }else if (score>=500 && score<1000){
            System.out.println("somewhere in between two baggles");
            return 2;
        }else if (score>=100 && score<500){
            System.out.println("less than half a bagle");
            return 3;
        }else
        return 4;
    }
}
