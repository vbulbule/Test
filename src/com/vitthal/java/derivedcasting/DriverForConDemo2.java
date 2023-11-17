package com.vitthal.java.derivedcasting;

public class DriverForConDemo2 {
    public static void main(String[] args) {

        /**
         * Object -> AbDemo1 -> AbDemo2 - > condemo2
         */
        AbDemo1 a = new ConDemo2(); // upcasting
        a.test1();
        a.test2();
       //a.test3();
        /**
         * cannot access the method oc sub class as its type a is Abdemo1 and Abdemo class members only accessible
         */
        System.out.println("---------------------");
        AbDemo2 a2 = new ConDemo2(); // upcasting
        a2.test1();
        a2.test2();
        a2.test3();
        /**
         * NOTE : 1. when upcasted and method is overriden we get overriden method.
         *        2. method and if method is not overriden we get orignal/inherited method
         *        3. When upcasted and method is overriden we get overriden method and if method is not
         */

    }
}
