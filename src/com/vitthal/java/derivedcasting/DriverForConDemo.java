package com.vitthal.java.derivedcasting;

public class DriverForConDemo {
    public static void main(String[] args) {

        /**
         * Object -> AbDemo -> Condemo
         *
         */

        AbDemo a = new ConDemo(); //upcasting
        a.test1();
        a.test2();
        //a.test3();
        /**
         * its own class method cant be accessiable because
         * even thougn new ConDemo(); object is created but the condemo object is upcasted to the abDemo
         * and AbDemo haas only 2 methods i.e test1 (implemented) and test2(unimplemented)
         * when we upcast the object the ConDemo object is now behave like Ab Demo thats why test3() method is not
         * able to access event tho it has test3() method
         *
         * IMPORTANT : reference variable of an object class can point towards object of the subclass that has implemented
         *

         */

    }
}
