package oca.statements;

public class If_Example {
    public static void main(String[] ar) {

        If_Example example = new If_Example();
        example.testMethod_1(true);
        example.testMethod_1(false);

        example.testMethod_2(true);
        example.testMethod_2(false);

        example.testMethod_3(true);
        example.testMethod_3(false);
    }

    public void testMethod_1(boolean param) {
        System.out.println("---- Method 1 with param " + param);
        if (param)
            System.out.println("Param is true (Method 1)");
            System.out.println("Should I be printed if param is false? (Method 1)");
    }

    public void testMethod_2(boolean param) {
        System.out.println("---- Method 2 with param " + param);
        if (param) {
            System.out.println("Param is true (Method 2)");
            System.out.println("Should I be printed if param is false? (Method 2)");
        }
    }

    public void testMethod_3(boolean param) {
        System.out.println("---- Method 3 with param " + param);
        if (param)
            if (param)
                if (param)
                    System.out.println("Param is true && true && true");
                else
                    System.out.println("Param is true $$ true && false?");
            else
                System.out.println("Param is true && false");
        else
            System.out.println("Param is false");

    }
}
