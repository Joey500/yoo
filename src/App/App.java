package App;

import java.awt.*;

/**
 * Created by Pavilion on 9-4-2016.
 */
public class App {
    public static void main(String[]args){
        Machine mach1 =new Machine();
        mach1.start();
        mach1.stop();
        Car car1=new Car();

      car1.start();
        car1.wipewwindShield();
        car1.showiInfo();
        car1.stop();


    }

}
