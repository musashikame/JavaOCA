package oca.basics.packageEins;

import oca.basics.packageZwei.ClassZwei;

public class ClassEins {
    public static void main(String[] ar) {
        ClassZwei c2 = new ClassZwei();
        c2.setName("Name Test");
        System.out.println("C2 ist: " + c2.getName());
    }
}
