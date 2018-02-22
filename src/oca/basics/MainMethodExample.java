package oca.basics;

public class MainMethodExample {

    /*The main method gets an Array of Strings as a parameter. Try executing the program from the command line with
    * the following commands:
    * java MainMethodExample param1 param2
    * java MainMethodExample param1 "param2 param3"
    * java MainMethodExample param1 "aram2 param3
    * java MainMethodExample param1 -> Hint. This would throw an Exception
    *
    * */
    public static void main(String[] ar) {
        System.out.println(ar[0]);
        System.out.println(ar[1]);
    }
}
