package com.vitthal.java.collection.hashsetdemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo1 {
    public static void main(String[] args) {
        /*
        1. Duplicates are not allowed in set
        2. it is un-ordered (insertion order is not miantained)
        3. to use set
           - HashSet
           - TreeSet

        -HashSet
            -it uses the hashcode of the object being inserted
            -THis class can be used when we want collection with no duplicates and order is not important
            when we iterate
            -it does not maintain the insertion order
            -and allows null

            NOTE: when we want to maintain insertion order use LinkedHashSet insted of HashSet
            linked HashSet extends HashSet

         */
        Set set = new HashSet();

        set.add(10);//
        set.add(true);
        set.add("Hello");
        set.add("World");
        set.add("Hello");
        set.add("World");
        set.add(null);// allows the null values
        System.out.println(set);

        //set.get()// metthod is not present because the insertion order is not maintained so there is no use of
                // get(int index)
        /*
        write a program to remove the duplicates
        String array {"Vitthal", "Bulbule", "Amruta","Amruta", "Vittha"}
        Vitthal Bulbule Amruta

         */
        System.out.println("---------------");
        for(Object obj : set){
            System.out.println(obj);
        }


       /* for(int i=0 ; i < set.size();i++){
            System.out.println(set.get(i));
        }
        Not possible to use the normal for loop for iterating because get methid is not avaliable in set
        */

        System.out.println("-- iterate using iterator -- ");
        Iterator setItr = set.iterator();
        while (setItr.hasNext()){
            System.out.println(setItr.next());
        }

        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);

        Set<Integer> s1 = new HashSet<>();

        s1.add(40);
        s1.add(20);
        s1.add(60);

        s.addAll(s1);

        System.out.println(s);

    }
}
