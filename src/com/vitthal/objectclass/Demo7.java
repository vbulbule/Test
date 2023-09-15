package com.vitthal.objectclass;

public class Demo7 {
    public static void main(String[] args) {
        Apple2 a1 = new Apple2(100);
        Apple2 a2 = new Apple2(200);
        Apple2 a3 = new Apple2(100);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println(a1 == a2); // address comparision
        System.out.println(a1 == a3); // address comparision

        System.out.println(a1.equals(a2)); // value comparision
        System.out.println(a1.equals(a3)); // value cpmpariion
        System.out.println(a1.equals(null));

        System.out.println(a1.equals(new Mango()));
        System.out.println(a1.equals(a1));

        /*


        you have to create the Text class
        which can have constructor parameterization to accept String value
        you have to override the equals method which can compare the length of Strings

       Text t1 = new Text("tt");
       Text t2 = new Text("xx");

       System.out.println(t1.equals(t2)); // true or false

         */

        /*
        Difference between == and .equals()

        == is a rational equality operator which is used to
        1. compare two primitive variables where it compares the value like x == y or x == 10

        2. to compare two non-primitive variables where it compares the address of the Object

        .equals() : is a non static method of object class which is by default compares the address.
        if we override we can compare the values
        ex. in String class .equals() method is overridden to compare its value

         */

    }
}
