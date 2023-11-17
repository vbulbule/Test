package com.vitthal.java.exceptions;

public class Demo22 {
    /*

     what is garbage collection?
     the garbage collector is under the control of JVM
     JVM decides to when to run the garbage collector
     From the java program we can tell JVM to run garbage collector
     we can write the code to make objects eligible fr garbage collection to setting up the reference
     variable to null
     */

    public static void main(String[] args) {

        Runtime rs = Runtime.getRuntime();
        System.out.println(rs.totalMemory());

        StringBuilder sb = new StringBuilder("Java");

        System.out.println(sb);
        System.out.println("Free memory before garbage collection : " + rs.freeMemory());
        sb = null; // eligible for garbage collection

        String s1 = new String("Hello");
        String s2 = new String("Java");

        s1 = s2;
        System.out.println(s1); // hello object is eligible
        System.out.println(s2);

        System.out.println(new String("banglore"));
        // new object is eligible for GC

        rs.gc(); //
        System.out.println("Free memory after garbage collection : " + rs.freeMemory());


    }
    }


