package Auto;

/**
 * Created by Pavilion on 5-4-2016.
 */


//datatype & variabelen
    public class beschikbaar implements aantal {
    String model;
    String name;

    //if constructor is empty
    public beschikbaar() {
        //set defaout model to unknown
        this.model = "unknow";
        //set default model to unknown
        this.name = "not found";
    }

    //if constructor =object giv model and name
    public beschikbaar(String model, String name) {
        //reference to datatype and variabele model
        this.model = model;
        this.name = name;

    }

    @Override
    public String getready() {
        String message = "hallo";
        return message;
    }

    @Override
    public String hallo() {
        String hallo = "yo";
        return hallo;
    }

    @Override
    public int a() {
        int a = 5;
        return a;
    }

    @Override
    public int b() {
        int b = 10;
        return b;
    }

    public int d() {
        int d = 10;
        return d;
    }

    public int k() {
        int k = 5;
        return k;
    }

    public int z() {
        int z = 3;
        return z;
    }

    public int p() {
        int p = 10;
        return p;
    }
}
