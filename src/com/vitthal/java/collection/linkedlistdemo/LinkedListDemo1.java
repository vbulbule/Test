package com.vitthal.java.collection.linkedlistdemo;

import java.util.*;

public class LinkedListDemo1 {
    /*
    Linked list is a combinition of both list and queue

    A linked list is ordered by index position
    like arraylist except that the elements are doubly linked to one another
    inserting and deleting is very fast in linked list
    but accessing element is very slow beacuse we need to traverse

    -when you want to add or remove elements frequently we can use the linked list
    -It allows the duplicates and null value
    -maintains insertion order
    -and its not sorted
     */
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
       // List l2 = new LinkedList<>(); // Linked list class implements List interface
       // Queue l3 = new LinkedList(); // Linked list class also implements Queue Interfaces
       // Deque l4 = new LinkedList();// Linked list class also implements Dqueue Interface
        l1.add("vitthal");
        l1.add("Amrutal");
        l1.add(100);
        l1.add(12.45);
        l1.add(100); // possible coz linked list allows duplicates
        l1.add(true);
        l1.add(null);// possible coz allows null
        l1.add(" Java ");

        System.out.println(l1);

        System.out.println("-- print the first element -");
        System.out.println(l1.getFirst());
        System.out.println(l1.get(0));
        System.out.println("-- print the first element -");
        System.out.println(l1.getLast());
        System.out.println(l1.get(l1.size()-1));

        System.out.println("-- add first --");
        System.out.println(l1);
        l1.addFirst("Hello");
        System.out.println(l1);

        System.out.println("-- add last --");
        System.out.println(l1);
        l1.addLast("Mumbai");
        System.out.println(l1);

        System.out.println("--print using for--");
        for(int i =0;i<l1.size();i++){
            System.out.print(l1.get(i) +" | ");
        }
        System.out.println("\n-- print using for each --");
        for(Object obj : l1){
            System.out.print (obj+" | ");
        }
        System.out.println("\n -- print using Iterator -");

        Iterator itr = l1.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" | ");
        }

        System.out.println("\n -- prin using List Iterator --");

        ListIterator listItr = l1.listIterator();
        while (listItr.hasNext()){
            System.out.print(listItr.next()+" | ");
        }
        System.out.println("\n -- print reverse using list iterator -- ");
        while (listItr.hasPrevious()){
            System.out.print(listItr.previous() +" | ");
        }

        System.out.println("\n -- print using decending order --");
        Iterator desc = l1.descendingIterator();
        while (desc.hasNext()){
            System.out.print(desc.next() +" | ");
        }

        System.out.println("\n----------------------------------------");
        l1.add("Ding"); // the add() is coming from LIST
        l1.offer("Dong");// the offer () is coming from DQUEUE

        System.out.println("\n");
        System.out.println(l1);

        System.out.println("---------------------------");
        System.out.println(l1.peekFirst());// returns first
        System.out.println(l1.peekLast());// returns last

        System.out.println("---------------");
        System.out.println(l1.peek()); // it retrives the object but does not remove
                                       // if the list is empty then it will returns null
        System.out.println(l1.peek());
        System.out.println(l1.peek());
        System.out.println("-----------------");
        System.out.println(l1);

        System.out.println(l1.element());    // retrives the object but does not remove
        System.out.println(l1.element());
        System.out.println(l1);
        // but if the list is empty then it will return the exception

        //l1.clear();
        System.out.println(l1.element());

        System.out.println("-----------------------------");

        System.out.println(l1.remove());
        System.out.println(l1.remove());
        System.out.println(l1.remove());
        System.out.println(l1);
        // retrives and remove the first element
        // if list is empty will return the exception

        System.out.println("------------------------------------");
        System.out.println(l1.poll());
        System.out.println(l1);
        // retrives and remove the first element
        // if list is empty will return the null






    }
}
