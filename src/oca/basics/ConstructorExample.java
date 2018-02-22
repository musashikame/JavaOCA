package oca.basics;

/*As a Default, Java provides a default no argument Constructor*/
public class ConstructorExample {
    public static void main(String[] ar) {
        //We can call this because we didn't specify a new one
        ConstructorExample ce = new ConstructorExample();
    }
}

/*In this class however, we define a constructor*/
class ConstructorOverride {
    private String name;

    /*Here we set a constructor that has a parameter*/
    public ConstructorOverride(String name) {
        this.name = name;
    }

    public static void main(String[] ar) {
        /*Since we defined a Constructor the following call if uncommented will not compile*/
        //ConstructorOverride co = new ConstructorOverride();

        /*Thus, the only way to instance this class is through the defined constructor*/
        ConstructorOverride co = new ConstructorOverride("Name");
    }
}
