package com.vitthal.java.collection.arraylistdemo;

import com.vitthal.java.collection.Apple;
import com.vitthal.java.collection.Fruit;
import com.vitthal.java.collection.Guava;
import com.vitthal.java.collection.Orange;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo1 {
    /*

    1. All the collection classes are under java.util package

    2. Collection classes prints the Object and if the objects are printing value then corresponding class of the object
    toString() method is overriden

    ex: if we add 10 it is wrapped into integer class object and when the object is printed the value is printed insted
    of address since toString method of integer wrapper class is overriden

    3. All the collection classes has to take an object as argument

    Note :
    Collection (With capital C) which is actually the java.util.Collection interface which is supermost in
    collections hierarchy and set, List and queue are extended

    Collections API is a set of classes and interface which holds Objects of same type or of different type
    we can add remove and iterate through the objects

    Collections in the java.util.collections which holds set of static utility methods for use with collection


     */
    public static void main(String[] args) {

        /*

        List
        Lists are the collections used for sorting sequence of elements and it allowes duplicates
        it maintains insertion order
        it is indexed (0,1, 2, 3)
        not sorted
        it allows null
         */

       // int val = 10;
        //Integer val2 = 100;


       int[] arry = new int[6];
       arry[0]= 19;

       //arry[1]= "String"; // not because its the int type array

        //
        // dynamic
        ArrayList list = new ArrayList();
        list.add(10); // add(Object obj)-> add(10)
                      // because 10 is refered to the Wrapper class of Integer
                      // every class in java is extends Object class
                      // even we pass 10 Integer it will wrapped to Object
        list.add(true);
        list.add("Hello");
        list.add(new String("Banglore"));
        list.add(new Orange());
        list.add(10); // duplicates
        list.add(null);// allows to add the null value
        Orange o1 = new Orange();
        list.add(o1);
        System.out.println(list); // how to print

        System.out.println(list.size()); // to print the size

        System.out.println(list.contains("Hello"));

        System.out.println(list.contains("Banglore"));
        System.out.println(list.contains(new Orange())); // false because equals method is not overriden means
                                                        // contain method check equals method
        System.out.println(list.contains(o1));

        // Arraylist is indexed

        System.out.println(list.get(5));
        System.out.println(list.get(6));

        // print all the values using for each loop
        for (Object b : list){
            System.out.println(b);
        }

        // to add objects of same type

        ArrayList<String> strArray = new ArrayList<>();

        strArray.add("Vitthal");
        //strArray.add(true); npt possible becuase ArrayList is declared to have only String objects
        strArray.add("Amruta");
        strArray.add("Java");
        strArray.add("Teaching");


        // to print using for each
        for (String s: strArray){
            System.out.println(s);
        }

        /*
         add(Object o)
         adding add(10) wrapped
         */

        ArrayList<Fruit> fruits = new ArrayList<>();

        Orange org = new Orange();
        Apple apple = new Apple();
        Guava guava = new Guava();

        fruits.add(org); // add(Fruite e)
                         // actually add(Orange)
                         // internally Fruite f = orange
                         // upcasting orange is caster to treate like an fruite
        fruits.add(apple);
        fruits.add(guava);


        // wanted to convert the arraylist to array

        Object[] fruitsArray = fruits.toArray();

        for (Object obj : fruitsArray){
            System.out.println(obj);
        }


        // wanted to print using Iterator

        Iterator<Fruit> itr = fruits.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("-------------------using list Iterator ---------------------");
        // using list Iterator
        ListIterator<Fruit> listIter = fruits.listIterator();

        System.out.println("-------------------forward --------------------");
        while (listIter.hasNext()){
            System.out.println(listIter.next());
        }

        System.out.println("---------------------reversr -------------------------");
        while (listIter.hasPrevious()){
            System.out.println(listIter.previous());
        }
     System.out.println("--------------------------------------------------------------------------------");
















    }
}
