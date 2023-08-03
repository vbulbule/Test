package com.vitthal.staticupcastingdemo;

public class Demo74 {

    public static void main(String[] args) {

       AbDemo1 a1 = new ConDemo(); // upcasting
        a1.paint();
        /**
         * super class static method is called compiler replaces a1 eith AbDemo.paint();
         */
        System.out.println(a1.i);

       ConDemo c1 =  new ConDemo();

        System.out.println(c1.i); // subclass i shadows inherited i

    }
}
