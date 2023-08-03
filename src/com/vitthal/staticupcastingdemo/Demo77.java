package com.vitthal.staticupcastingdemo;

public class Demo77 {
    public static void main(String[] args) {

        A a1 = new B(); // upcasting
        a1.print();
        a1.test(); // Amruta chuklis
        /**
         *  Overriden method will be called insted of original in the super class
         */
        //a1.disp() // sub class method cannot be access in super class
    }
}
