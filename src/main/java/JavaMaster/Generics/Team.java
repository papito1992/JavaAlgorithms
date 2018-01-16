package JavaMaster.Generics;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won= 0;
    int lost= 0;
    int tied= 0;
    private ArrayList<T> members= new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addPlayer(T player){
if (members.contains(player)){
    System.out.println(player.getName()
     +" already on the team");
    return false;
}else{ }
members.add(player);
        System.out.println(player.getName()
                +" added tot he team" +this.name);
return true;
    }
    public int numPlayers(){
        return this.members.size();
    }
    public void matchResult(Team<T> oppenent, int ourscore, int theirScore){
        String message;
        if (ourscore>theirScore){

            message=" Beat ";
            won++;
        }else if (ourscore==theirScore){

            message=" tied with";
            tied++;
        }else {

            message=" lost to ";
            lost++;
        }
        //inccreasng nr of games played
        played++;
        if (oppenent!=null){
            System.out.println(this.getName() +message +oppenent.getName());
            oppenent.matchResult(null,ourscore,theirScore);
        }

    }
    public int ranking(){
        return ((won*2) +tied);
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking()>team.ranking()){
            return -1;
        }else if (this.ranking()<team.ranking()){
            return 1;
        }else {
        return 0;}
    }
}
