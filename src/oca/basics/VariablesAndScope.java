package oca.basics;

public class VariablesAndScope {
    //Class Variable: It's the same for all the Instances
    static int MAX = 5;

    //Instance Variables: the Values depende on the class; These are initialized with default values.
    int x;
    int y;

    public int trickUpdateMethod(int x) {
        //Local Variable. The x here is not the x defined in line 8
        System.out.println("I got x with: " + x);
        x = x + 5;
        System.out.println("I updated x to: " + x);
        return x;
    }

    public String toString() {
        return x + ", " + y;
    }

    public static void main(String[] ar) {
        //Here we know all the variables there are
        VariablesAndScope var1 = new VariablesAndScope();
        System.out.println(var1);

        var1.x = 1;
        var1.y = 1;
        System.out.println(var1);

        VariablesAndScope var2 = new VariablesAndScope();
        var2.x = 2;
        var2.y = 2;
        System.out.println(var2);

        var2.trickUpdateMethod(var2.x);
        System.out.println(var2);

        if (true) {
            //If you comment line 43 and uncomment line 42 code won't compie. Local Variables should always be initialized
            //int anInt;
            int anInt  = 77;
            System.out.println(anInt);
        }
    }
}
