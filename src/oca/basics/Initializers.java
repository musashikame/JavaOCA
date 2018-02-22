package oca.basics;


public class Initializers {
    /*order matters!!!:
    * try commenting line 9 and uncommenting line 17. Line 14 compiles, but line 13 doesn't
    * */

    private int num;
    /*This is a Instance Initializer: This code will be ONLY executed EACH we Instance this class.*/
    {
        System.out.println("Initializing the class. Setting num to 1");
        System.out.println(num);
        num = 1;
    }

    //private int num;

    /*This is an static Initializer: This cod will be ONLY executed once; even though the class hasn't been initialized*/
    static{
        System.out.println("Static Initializer!");
        //Since we are working with a static code, we can't reference num here. Uncomment to see the error
        //System.out.println(num);
    }

    public Initializers() {
        System.out.println("Creating the object: adding 1 to num");
        num = num + 1;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    public static void main(String[] ar) {
        System.out.println("Entering main");
        Initializers init = new Initializers();
        Initializers init2 = new Initializers();

        System.out.println("Num in init: " + init.getNum());
        System.out.println("Num in init2: " + init2.getNum());
    }
}
