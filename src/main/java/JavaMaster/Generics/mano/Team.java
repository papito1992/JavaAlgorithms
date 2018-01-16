package JavaMaster.Generics.mano;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    int played=0;
    int lost=0;
    int won=0;
    int tied=0;
//arraylist of type player
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
            +" is already on the team");
            return false;
        }else {
            members.add(player);
            System.out.println(player.getName() +" added to team : " +this.getName());
            return true;
        }
    }
    public int numPlayers(){
        return this.members.size();
    }
    public void matchResult(Team opponent, int ourscore, int theirScore){
        if (ourscore>theirScore){
            won++;
        }else if (theirScore>ourscore){
            lost++;
        }else {
            tied++;
        }
        played++;
        if (opponent!=null){
            opponent.matchResult(null,ourscore,theirScore);
        }

    }
    public int ranking(){

        return ((won*2)+tied);
    }
}
