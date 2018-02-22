package oca.basics;


public class Identifiers {
    //This are valid identifiers names:
    private int $AnInt;
    private String String;
    private int Integer;
    private int _Valid$45;

    //This aren't valid -- Comment to compile/run
    //private int 45Int;
    //private int private;
    //private int look@ut;

    public static void main(String[] ar) {
        //These are valid numbers:
        int anInt =  100_000_00;
        double aDouble = 10_00_00.00;

        //These aren't
        //int anotherInt = 10_00_;
        //double anotherDouble = 10._00;
    }
}
