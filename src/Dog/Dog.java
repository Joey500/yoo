package Dog;

/**
 * Created by Pavilion on 7-4-2016.
 */
public class Dog {
    public String bark;
    public String furColor;
    public String eyeColor;
    public int age;

    public Dog(String bark, String furColor, String eyeColor,int age) {
        this.bark = bark;
        this.furColor = furColor;
        this.eyeColor = eyeColor;
        this.age = age;

    }

    public String bark(){;
            return bark;
}
    public String eyeColor(){;
        return eyeColor;
    }
    public String getBark() {
        return bark;
    }

    public int GetAge(){
        return age;
    }

    public String hallo(){
        String hallo ="hoi";
        return hallo;
    }

    public String furColor() {
        return furColor();
    }
}
