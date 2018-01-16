package JavaMaster.Inheritance.car;

/**
 * Created by dev on 6/07/15.
 */
public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at  " + currentVelocity + " in direction " + currentDirection);

    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        int reduction=200;
//        this.currentVelocity = 0;
      while(currentVelocity!=0){
          System.out.println("Stopping, current speed : " +currentVelocity  +" at the rate of " +reduction );
          currentVelocity-=reduction;

//            if ((currentVelocity-=reduction)>0){
//
//                System.out.println("stopping " +currentVelocity);
//
//            }
 if ((currentVelocity-reduction)<0){
     if (currentVelocity>0){
         while (currentVelocity!=0){
             System.out.println("Stopping, current speed : " +currentVelocity  +" at the rate of : " +Math.sqrt(currentVelocity) );
         currentVelocity-=Math.sqrt(currentVelocity);}
     }
     System.out.println("full stop, current speed " +currentVelocity);
     break;



          }if (currentVelocity==0){
              System.out.println("full stop, current speed " +currentVelocity);
              break;
          }
        }

    }
}
