package com.vitthal.java.collection.mapdemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {
    /*
                       Map(Interface)
                        | extends
                 SortedMap(Interface)
                        | extends
                   NavigableMap(Interface)
                        | implements
                    TreeMap(Class)

         - TreeMap contains only unique elements
         - TreeMap cannot have null kay but can have null values
         - TreeMap is non synchronized
         - TreeMap maintains ascending order



     */

    public static void main(String[] args) {

        TreeMap<String, String> tm= new TreeMap<>();

        tm.put("Vitthal","Bulbule");
        tm.put("Amruta","Chougule");
        tm.put("Prachi", "Kokitkar");

        System.out.println(tm);

        System.out.println("-- itrate --");
        for (Map.Entry m:tm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    /*
    What is the difference betwen HashMap and Tree map

    HashMap:
    - can contains one null
    - Hashmap maintains no order

    Tree Map
    - TreeMap cannot contain any null key
    - TreeMap maintains Ascending order

    --
    Array and array list
    LinkedList and Array list
    HashSet and HashMap

     */


}
