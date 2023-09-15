package com.vitthal.polymorphism;

public class Driver {
    public static void main(String[] args) {
        /*
        Object
        AutoMobile
        Truck
         */

        Automabile a = new Automabile();
        Truck t = new Truck();
        a.drive();
        t.drive();
        a = t; // upcasting
       // Automabile a1 = new Truck();
        a.drive(); // overriden method will be called
    }
}
