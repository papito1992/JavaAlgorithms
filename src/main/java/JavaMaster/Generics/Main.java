package JavaMaster.Generics;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("joe");
        BaseBallPlayer pat = new BaseBallPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("beckam");

        Team<FootballPlayer> papitos = new Team<>(" Das Foot Papitos");
        Team<BaseBallPlayer> papitos1 = new Team<>(" Das BasePapitos");
//        Team<SoccerPlayer> papitos2 = new Team<>(" Das SocPapitos");
        papitos.addPlayer(joe);
//        papitos1.addPlayer(pat);
//        papitos2.addPlayer(beckham);
//        System.out.println(papitos.numPlayers());
//
        Team<FootballPlayer> melbourne= new Team<>("Melbourne Faggs");
//        FootballPlayer banks= new FootballPlayer("James Banes Coffe");
//melbourne.addPlayer(banks);
        Team<FootballPlayer> hawthorne= new Team<>("hawthorne Faggs");
        Team<FootballPlayer> mumdone= new Team<>("mumdone Cunts");

        hawthorne.matchResult(mumdone,10,36);
        hawthorne.matchResult(melbourne,96,69);

papitos.matchResult(hawthorne,1,3);
papitos.matchResult(melbourne,1,3);
        System.out.println("rankings" +"\n" +papitos.ranking() +" " +papitos.getName());
        System.out.println("rankings" +"\n" +hawthorne.ranking() +" " +hawthorne.getName());
        System.out.println("rankings" +"\n" +mumdone.ranking()+" " +mumdone.getName());
        System.out.println("rankings" +"\n" +melbourne.ranking()+" " +melbourne.getName());
        System.out.println(hawthorne.compareTo(papitos));
        System.out.println(hawthorne.compareTo(mumdone));
        System.out.println(        papitos.compareTo(hawthorne)
        );    }
}
