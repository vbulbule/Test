package com.vitthal.java.collection.hashsetdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo2 {
    /*
               Iterable
                  |extends
               Collection
                  |extends
                 Set
                  |implements
               HashSet (class)
                  | extends
              LinkedHashSet (class)

       - HashSet stores the element by using mechanism called Hashing
       - HashSet contains unique elements only
       - it allows null
       - HashSet is not synchronized
       - HashSet dosent maintain the insertion order elements are inserted on the basis of their hashcode
       - HashSet is the best for search operations

       Difference between List and Set?
       A list contain duplicates wheresas Set contains only unique elements

       Hierarchey of HashSet class?
       THe HashSet class extends AbstraactSet class which implements Set interface.
       the Set interface extends Collection and Iterable Interfaces
       ex :public class HashSet<E> extends AbstractSet<E> implements Set<E>

       What are all constructors are present in HashSet?

       1. HasSet()
       2. HasSet(int capacity) // initially internally it will set the size of HashSet
       3. HashSet(int capacity, int load factor) // initially internally it will set the size of HashSet
                                                  //default capicity is 16 and load factor is 0.75
       4. HasSet(COllection <?E> c)

       Methods of HashSet
       1. add()
       2. clear()
       3. clone() // object class
       4. contains(Object o)
       5. isEmpty()
       6. iterator()
       7. remove(Object o)
       8. size() // retunn int
       9. splitIterator() // return the SPlitIterator

     */
    public static void main(String[] args) {

        List ls = new ArrayList<>();


        HashSet s = new HashSet();
        HashSet s1 = new HashSet(16, (float)0.75);
        s.add("vitthal");
        System.out.println(s);

        HashSet s2 = new HashSet(ls); // to convert array list to hashSet


        HashSet<String> set = new HashSet();

        set.add("Vitthal");
        set.add("Amruta");
        set.add("Vikas");
        set.add("Prachi");
        set.add("Sumit");

        System.out.println(set);
        set.remove("Sumit"); // remove the specific element
        System.out.println(set);

        HashSet<String> set1 = new HashSet();

        set1.add("Vinay");
        set1.add("Tejas");
        set1.add("Monika");
        set1.add("Prachi");

        set.addAll(set1);
        System.out.println(set);

        set.removeAll(set1); // removes all elements using removeALl
        System.out.println(set);

        set.clear(); // removes all the data from HashSet
        System.out.println(set);






    }



}
