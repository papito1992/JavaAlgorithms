package JavaMaster.Inheritance.Part2;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions= new Dimensions(20,20,5);
        Case theCase = new Case("200b", "Dell", "240", dimensions);
//        Resolution resolution= new Resolution(15,23);
        Monitor theMonitor= new Monitor("1569az", "Intel", 15, new Resolution(2540,1440));
        Motherboard motherboard= new Motherboard("aSS 200", "Assus", 4, 2, "v2.69");
        PC pc= new PC(theCase,theMonitor,motherboard);
        pc.getMonitor().drawPixalAt(1500,6900,"red");
        pc.getMotherboard().loadProgram("wat wat 0.69");
        pc.getTheCase().pressPowerButton();

    }
}
