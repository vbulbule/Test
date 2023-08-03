package com.vitthal.staticupcastingdemo;

public class Demo76 {
    public static void main(String[] args) {
        /**
         *
         *
         *
         */
        IDemo2 i2 =new ConDemo3();
        i2.test1();
        i2.test2();
        System.out.println("-------");
        IDemo1 i1 = new ConDemo3();
        i1.test1();
       // i1.test2(); not able to access

    }
}
