package oca.statements;

public class Switch_Example {
    public static void main(String[] ar) {
        Switch_Example example = new Switch_Example();

        example.testMethod_1(5);
        example.testMethod_1(2);

        example.testMethod_2(5);
        example.testMethod_2(2);

        example.testMethod_3(5);
        example.testMethod_3(2);
    }

    public void testMethod_1(int param) {
        System.out.println("--- testMethod_1, param: " + param);
        switch(param) {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("three");
            case 3:
                System.out.println("four");
            default:
                System.out.println("none of the above");
        }
    }

    public void testMethod_2(int param) {
        System.out.println("--- testMethod_2, param: " + param);
        switch(param) {
            default:
                System.out.println("none of the others");
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("three");
            case 3:
                System.out.println("four");
        }
    }

    public void testMethod_3(int param) {
        System.out.println("--- testMethod_3, param: " + param);
        switch(param) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("three");
                break;
            case 3:
                System.out.println("four");
                break;
            default:
                System.out.println("none of below");
        }
    }

    public void testMethod_4() {
        //Uncomment this param to see the error.
        //int param;

        //Comment this line if you uncomment line 64
        int param = 1;
        switch(param) {
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("not one");
        }
    }
}
