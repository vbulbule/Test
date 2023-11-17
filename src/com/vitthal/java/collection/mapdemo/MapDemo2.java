package com.vitthal.java.collection.mapdemo;

import java.util.HashMap;

public class MapDemo2 {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        /*
        in hash map we cna store the alues in key value pairs
         */

        hm.put(100,"Amruta");
        hm.put(101,"Vitthal");
        hm.put(102,"Rahul");

        hm.putIfAbsent(103,"Gaurav");
        /*
        it will check the key is present or not
        if present then it will not add
        if not present the it will add
         */

        System.out.println(hm);

        HashMap<Integer,String> hm1 = new HashMap<>();
        hm1.put(104,"Sunil");

        hm1.putAll(hm);
        /*
        putAll() method will add another map to the exsisting map
         */
        System.out.println(hm1);

        hm1.remove(100);
        /*
        remove method will delete the entry of Key and associated value
         */
        System.out.println(hm1);

        hm1.remove(101,"Vitthal");
        System.out.println(hm1);
        /*
        remove(Key) method will remove the entry of passed key
        remove(key value) : method will remove the key associated with the value
        if passed key and value is not matched then it wont remove
         */

        hm1.replace(102, "Kolhapur");
        System.out.println(hm1);

        hm1.replace(102,"Kolhapur","Pune");
        System.out.println(hm1);

        /*

        HashMap :
        -it is class which implements map interface it holds objects as key and velue pairs
        -It is not ordered (not indexed)
        -Keys are unique and can have 1 null key
        -if we assign new value to exsisting key, value gets overriden
        -different keys can have same values

         */




    }
}
