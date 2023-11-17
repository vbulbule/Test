package com.vitthal.java.collection.arraylistdemo;

import com.vitthal.java.collection.Apple;
import com.vitthal.java.collection.Orange;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {

    /*
           Overriding the euqals and hashcode method correctly important for using the classes with contains
           (perticularly Hashmap and hashset)
*/

    public static void main(String[] args) {

        ArrayList lst = new ArrayList(); // declaration of arraylist

        lst.add(new Apple(123));
        Apple a1 = new Apple(200);
        lst.add(a1);
        System.out.println(lst);

        lst.remove(new Apple(123)); // removes the first object

        System.out.println(lst);

        List l1 = new ArrayList();
        l1.add(new Orange());
        l1.add(new Orange());

        Orange o1 = new Orange();
        l1.add(o1);
        l1.add(new Orange());
        l1.add(new Orange());
        l1.add(new String("Hello"));
        System.out.println(l1.size());
        System.out.println(l1);

        l1.remove(new Orange());


        List l2 = new ArrayList();
        l2.add(new Orange());

        l1.removeAll(l2);
        System.out.println(l1);


    }
}
