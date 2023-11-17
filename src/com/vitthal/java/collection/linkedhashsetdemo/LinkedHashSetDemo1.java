package com.vitthal.java.collection.linkedhashsetdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    /*
                  Iterable (Interface)
                     | extends
                 Collection (Interface)
                     | extends
                    Set (Interface)
                     | implements
                   HashSet (class)
                     | extends
                  LinkedHashSet (class)

         - LinkedHashSet class contains unique elements only like HashSet
         - LinkedHashSet class provides all optional set operations and permits null elements
         - it is non-synchronoized
         - linkedHashSet maintains insertion Order

         Hierarchy :
         LinkedHashSet class extends the HashSet, which implements the set interface.
         The set interface inherits COllection and iterable

         COnstructors :
         LinkedHashSet() : it is used to construct the Default LinkedHashset
         HashSet(Collection c) : it is used to initialize the hash set by using the elements of collection C
         LinkedHashSet(int capacity) : it is used to initialize the capacity of linked hash set to the given integer
                                       value capacity
         LinkedHashSet(int capacity, float fillratio): it is used to initialize both the capacity and fill ratio
                                                       (also called load capacity) of the hashset from its argument




     */
    public static void main(String[] args) {


        LinkedHashSet<String> str = new LinkedHashSet<>();
        str.add("one");
        str.add("two");
        str.add("three");
        str.add("four");
        str.add("five");
        str.add("five"); // duplicates is not allowed
        System.out.println(str);

        System.out.println("-- using enhance for --");
        for (String s : str){
            System.out.println(s);
        }

        System.out.println("-- iterator --");
        Iterator<String> itr = str.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        LinkedHashSet<String> str1 = new LinkedHashSet<>();
        str.add("eleven");
        str.add("twelve");
        str.add("therteen");
        str.add("fourteen");
        str.add("fifteen");


         str.addAll(str1);
        System.out.println(str);



    }
}
