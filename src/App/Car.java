package App;

/**
 * Created by Pavilion on 9-4-2016.
 */
public class Car extends Machine {
    @Override
    public void start() {
        System.out.println("car started");

    }

    public void wipewwindShield() {
        System.out.println("wiping started");
    }

    public void showiInfo() {
        System.out.println("Car name: " +name+a);
    }
}