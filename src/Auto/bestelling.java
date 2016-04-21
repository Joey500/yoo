package Auto;

import java.awt.datatransfer.SystemFlavorMap;

/**
 * Created by Pavilion on 5-4-2016.
 */
public class bestelling {
    public static void main(String[]args){
        beschikbaar auto1 =new beschikbaar();
        beschikbaar auto2=new beschikbaar("ferrari", "zalwei");
        beschikbaar auto3=new beschikbaar();
        // methode
        System.out.println(auto1.b());
        System.out.println(auto1.a());
        System.out.println(auto1.hallo());
        System.out.println(auto1.getready());
        System.out.println("model: " + auto2.model);
        System.out.println(auto2.name);
        System.out.println(auto1.d());
        System.out.println(auto1.k());
        System.out.println(auto1.z());
        System.out.println(auto3.p());
    }
}
