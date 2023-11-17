package com.vitthal.java.collection.mapdemo;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo1 {
    /*
                   Map (interface)
                    | implements
                  HashMap (Class)
                    | extends
                LinkedHashMap(class)

          --------------------------------
          | Previous | Key Value | Next  |
          --------------------------------

          - LinkedHashMap contains values based on keys
          - LinkedHashMap contains unique keys
          - LinkedHashMap may have one null key and multiple null values
          - LinkedHashMap is non synchronized
          - LinkedHashMap miantains insertion order
          - LinkedHashMap default capacity of Java HashMap class is 16 and load factor is 0.75

          Linked hash Map parameters
          K : it is the type of keys maintained by map
          V : it is the type of mapped values

          COnstructors:
          LinkedHashMap() : default constructor
          LinkedHashMap(int capicity) : used to initilize LinkedHashap with given capacity

     */
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        lhm.put(100,"Vitthal");
        lhm.put(101,"Amruta");
        lhm.put(102,"Prachi");

        System.out.println("-- Print LinkedHash Map --");
        Set<Map.Entry<Integer, String>> set = lhm.entrySet();

        Iterator<Map.Entry<Integer, String>> itr = set.iterator();

        while (itr.hasNext()){
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("-- Print using enhance loop --");

        for (Map.Entry m:lhm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println(lhm);
        System.out.println("Print only keys :" + lhm.keySet());
        System.out.println("Print only values : "+lhm.values());
        System.out.println("Key-values :"+lhm.entrySet() );

    }
}
