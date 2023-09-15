package com.vitthal.objectclass;

public class Demo4 {
    public static void main(String[] args) {
        B b1 = new B();
        System.out.println(b1);
        System.out.println(b1.toString());
        System.out.println(new B());
        System.out.println(new Demo4());
        /*
        I will print address because toString method is not overriden in Demo4 class
        that why default toString method will be called and that will print hte address

        REMEMBER : When the metthod is overriden then the overriden method will be called
         */


    }
}
