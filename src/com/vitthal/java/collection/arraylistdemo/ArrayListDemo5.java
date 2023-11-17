package com.vitthal.java.collection.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo5 {
    // sorting Arraylist with same type

    /*
    SOrting can be done only if collections is of same type and comparable
     */
    public static void main(String[] args) {

        ArrayList lst = new ArrayList<>();


        lst.add(10);
        lst.add(25);
        lst.add(15);
        lst.add((int)12.56);

        System.out.println("---- before sort--");
        System.out.println(lst);
        Collections.sort(lst);
        System.out.println("---- after sort--");
        System.out.println(lst);

        lst.clear();

        lst.add("vitthal");
        lst.add("vikram");
        lst.add("aayush");
        lst.add("onkar");
        lst.add("suraj");
        lst.add("snehal");
        lst.add("prachi");

        System.out.println("---- before sort--");
        System.out.println(lst);
        Collections.sort(lst);
        System.out.println("---- after sort--");
        System.out.println(lst);

        Collections.shuffle(lst); // shiffle
        System.out.println("After Shuffling");
        System.out.println(lst);







    }
}
