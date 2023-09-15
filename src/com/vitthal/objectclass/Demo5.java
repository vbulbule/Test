package com.vitthal.objectclass;

public class Demo5 {

    public static void main(String[] args) {

        C c1 = new C();
        C c2 = new C();
        C c3 = new C();

        System.out.println(c1 == c2); // address comparision
        System.out.println(c1.equals(c2)); // compare its addresss

        c1 = c3;
        System.out.println(c1 == c3);
        /*
        equals method is not overriden so address will be compared
         */

        String s1 = new String("Amruta Bad");
        String s2 = new String("Amruta Bad");

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true


    }
}
