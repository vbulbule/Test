package com.vitthal.string;

public class Demo2 {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = new String("Developer");

        String s3 = "Java";
        String s4 = new String("Developer");

        System.out.println(s1 == s3);
        System.out.println(s2 == s4);

        String s5 = new String("Java");

        System.out.println(s1 == s5);

        /*

        String class Object created without new keyword will be created constant pool
        (This happens only for String Class and wrapper class)
        If we have one more object with same value without new keyword then the variable will
        points towards the already existing object.

        (In constant pool you can have only constant object)

        String s1 = "Java";
        String s2 = new String("Developer");
        like String S3 = "Java"
        not allowed to create a seperate (duplicate) object
        it referes to the current object if already exists

        but
        String s4 = new String("Developer");
        String s5 = new String("Java");

        each time it will create the object when we create the object using new keyword

        S1 == s3 = true
        S2 == s4 = false
        s1 == s5 = false

        s3.equals(s5) // to compare values in the object use equals method




         */

    }
}
