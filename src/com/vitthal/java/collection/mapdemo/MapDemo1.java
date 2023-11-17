package com.vitthal.java.collection.mapdemo;

import java.util.*;

public class MapDemo1 {
    /*
    There are two interfaces for implementing map in java
    Map and SortedMap - interfaces
    HashMap, LinkedHashMap and TreeMap

    Map Hierarchy
                              Map (interface)
                                  | extends
                          SortedMap (interface)
                                  | implements
                             TreeMap (class)
            ---------------------------------------------
                                Map(interface)
                                    | implements
                                HashMap (class)
                                    |extends
                              LinkedHashMap (class)

          - Map dosent allow duplicate keys but you can have dulpicate values
          - HashMa and LinkedHashMap allow null keys and values but
          - TreeMap dosent alloe any null key or value

          A Map can't be traversed so you need to convert it into set using keySet() or entrySet() method

          CLasses of Map family

          HashMap : HashMap is the implementation of Map but it dosent maintain any order
          LinkedHashMap : LinkedHashMap is the implementation of map it inherits HashMap class
                          it maintains insertion order
          TreeMap : TreeMap is the implementation of Map and sorted map and it maintaions ascending order

          Methods of Map interface

          1. put(Object key, Object value) : used to inset an entry in the map
          2. putAll(Map map) : it is used to insert the specific map in the map
          3. putIfAbsent() : it inserts the specified value with the specified key in the map only if is
                             not already specified
          4. remove(Object key) : it is used to delete an entry for the specified key
          boolean remove(Object key, Object value) : it removes the specified values with the
                                 assocoiated specified keys from the map
          5. keySet() : it returns the set view of containing all the keys
          6. Set<Map.Entry<K,V>> entrySet() : it returns the set view containing all the keys and values
          7. clear() : used to reset the map
          8. containsValue(Object value) : this method return the true if some value equal to the value
                                            exists within the map otherwise returns false
          9. containsKey(Object key) :    this method return the true if some key equal to the key
                                            exists within the map otherwise returns false
          10. equals(Object o) : it is used to compare the specified object with the map
          11. get(Object key) : this method returns the object that contains the value associated with key
          12. isEmpty() : this methos return true if the map is empty
                                      returns false if the map is not empty
          13. replace(K key, V oldval, V newval) : it replaces the old values with the new for specified key
          14. replaceAll() : it replaces each entry's value with the result of invoking the given function on
                             that entry until all entries have been processed or the function throws
                             exception
          15. int size() : this method returs the no of entries in the map


          Map.Entry Interface
          Entry is the sub interface of map
          we can access it by Map.Entry name
          it returns a collection view of the map whose elements are of this class
          it provides method to get key and value

          Methods of Map.Entry

          1. getKey()
          2. getValue()
          3. hashCOde()
          4. setValue(V value)
          5. equals(Object o)
          6. comparingByKey( Comparator)
          7. comparingByValue(Comparator)
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Vitthal");
        list.add("Bulbule");

        /*(key)name=vitthal(value)
        (key)surname=bulbule(value)  */

        HashMap<String,String> map = new HashMap<>();
        map.put("name","vitthal");
        map.put("surname","bulbule");
        map.put("middlename","maruti");

        System.out.println(map);

        System.out.println("-- how to iterate --");

        Set<Map.Entry<String, String>> set = map.entrySet();
        /*
        map.entrySet() will returns the a Set of Map.Entry<String, String> view of the mappings
                       contained in this map.
         */
        Iterator itr = set.iterator();
        /*
        set.iterator(); will iterate set one by one
        but remenber in set now we have map and in map values are stored in Key value pairs
         */
        while (itr.hasNext()){
            /*
            itr.next() will return the set view of map entry
            so the map entry we need to cast it to Map.Entry so we can able to retirve
            the maps Keys and values
             */
            //System.out.println(itr.next());
            System.out.println("-- print only values of map --");
            Map.Entry entry = (Map.Entry) itr.next();
            /*
            (Map.Entry) itr.next() will returns the MapEntry and using the getValue() and
            getKey() method we can retrive the the values and keys of map
             */
            System.out.println(entry.getValue());
        }

        System.out.println("----- iterate option 2 -----");
        for( Map.Entry m: map.entrySet()){
            System.out.println("Key :"+m.getKey()+" | Value : "+m.getValue());
        }








    }
}
