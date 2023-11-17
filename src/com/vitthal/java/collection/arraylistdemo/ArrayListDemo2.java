package com.vitthal.java.collection.arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        //ArrayList list = new ArrayList();

        List list = new ArrayList();
        list.add("Java");
        list.add(100);
        System.out.println(list);
        list.add(1, true); // add values with index
        System.out.println(list);

        List list1 = new ArrayList();
        list1.addAll(list);
        System.out.println(list1);



        list1.addAll(3, list);
        System.out.println(list1);

        list1.remove(1);
        System.out.println(list1);

        list1.remove(Integer.valueOf(100)); // wrap it to a primitive value
        System.out.println(list1);

        System.out.println("---remove ---");
        list1.removeAll(list);
        System.out.println(list1);

        list1.addAll(list);
        list1.add("Vitthal");
        list1.add("Amruta");
        System.out.println(list1);

       System.out.println("---retain ---");
        list1.retainAll(list);
        System.out.println(list1);

        list1.clear();

        System.out.println(list1);








    }
}
