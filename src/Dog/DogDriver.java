package Dog;

/**
 * Created by Pavilion on 7-4-2016.
 */
public class DogDriver {
    public static void main(String[]args){
        Dog corgi =new Dog("yip","green", "purple",10);

        System.out.println(corgi.GetAge());

        System.out.println(corgi.GetAge());
        System.out.println(corgi.hallo());
        System.out.println(corgi.eyeColor());
        System.out.println(corgi.getBark());
    }
}
