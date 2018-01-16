package JavaMaster.InnerClasses;

public class Main {
    public static void main(String[] args) {
Gearbox gearbox= new Gearbox(6);
Gearbox.Gear first= gearbox.new Gear(1,12.3);
        System.out.println(first.driveSpeed(1000));    }
}
