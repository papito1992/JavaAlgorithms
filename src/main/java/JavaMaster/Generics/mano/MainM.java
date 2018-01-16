package JavaMaster.Generics.mano;

import JavaMaster.Generics.BaseBallPlayer;

public class MainM {
    public static void main(String[] args) {

        BaseballPlayer joe= new BaseballPlayer("jeff");
        System.out.println(joe.getName());
        Team<BaseballPlayer> team= new Team<>("Sharks");
        Team team1= new Team("Sharks1");
        System.out.println(        team.getName()
        );
        team.addPlayer(joe);
        team1.addPlayer(joe);
        team.matchResult(team1,1,1);
        team1.matchResult(team1,1,2);
        team.ranking();
        System.out.println("rankings" +"\n" +team.ranking() +" " +team.getName());
        System.out.println("rankings" +"\n" +team1.ranking() +" " +team1.getName());
    }
}
