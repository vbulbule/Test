package com.vitthal.java.collection.hashsetdemo;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo3 {
    /*
    How to create the HashSet from another collection
     */
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("Vitthal");
        al.add("Mahesh");
        al.add("Mahesh");
        al.add("Taniya");
        al.add("Taniya");

        System.out.println(al);
        // i want to convert this array list into hashset

        HashSet set = new HashSet(al);
        set.add("Prachi");

        System.out.println(set);

    }
}
