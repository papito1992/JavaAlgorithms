package JavaMaster.Inheritance;

import java.util.Scanner;

public class Vechile {
   private int wheelNumber, doorNumber, horsePower, weight;
   public enum SteeringWheelPosition {left,right};
   public enum gearType {manual,automatic};
Scanner scanner;
    public Vechile(int wheelNumber, int doorNumber, int horsePower, int weight) {
        System.out.println("enter Steering side : ");
        scanner= new Scanner(System.in);

        this.wheelNumber = wheelNumber;
        this.doorNumber = doorNumber;
        this.horsePower = horsePower;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
