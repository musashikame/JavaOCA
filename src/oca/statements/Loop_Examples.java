package oca.statements;

public class Loop_Examples {

    public static void main(String[] ar) {
        Loop_Examples examples = new Loop_Examples();

        examples.whileTest_1(3);
        examples.doWhileTest_1(3);

        examples.whileTest_1(0);
        examples.doWhileTest_1(0);

        examples.forTest_1(3);
        examples.forTest_1(0);

        //Infinete Loop. Uncomment to Test
        //examples.whileTest_Infinite();

        //Infinete Loop. Uncomment to Test
        //examples.forTest_Infinite();
    }

    public void whileTest_1(int var) {
        System.out.println("--- whileTest_1, var: " + var );
        int times = 0;
        while(var > 0) {
            var--;
            times++;
        }

        System.out.println("I iterated: " + times + ", times");
    }

    public void doWhileTest_1(int var) {
        System.out.println("--- doWhileTest_1, var: " + var );
        int times = 0;
        do {
            var--;
            times++;
        } while(var > 0);

        System.out.println("I iterated: " + times + ", times");
    }

    public void forTest_1(int var) {
        System.out.println("--- foreTest_1, var: " + var );
        int times = 0;
        int anotherTimes = 0;
        for (int i = var; var > 0; var--, times++) {
            anotherTimes++;
        }

        System.out.println("I iterated: " + times + ", times");
        System.out.println("I also iterated: " + anotherTimes + ", anotherTimes");
    }

    public void forTest_2(int var) {
        System.out.println("--- foreTest_2, var: " + var );
        int times = 0;
        int anotherTimes = 0;
        int i = 0;
        //Line 63 does not compile
        //for (int i = var; var > 0; var--, times++) {

        //Line 67 does compile
        for(i = var;  var > 0; var--, times++) {
            anotherTimes++;
        }

        System.out.println("I iterated: " + times + ", times");
        System.out.println("I also iterated: " + anotherTimes + ", anotherTimes");
    }

    public void whileTest_Infinite() {
        System.out.println("--- whileTest_Infinite");
        System.out.println("this is an Infinite Loop. Program will not end automatically");
        while(true) {
            System.out.print(".");
        }
    }

    public void forTest_Infinite() {
        System.out.println("--- forTest_Infinite");
        System.out.println("this is an Infinite Loop. Program will not end automatically");
        for(;;) {
            System.out.println("...");
        }
    }

}