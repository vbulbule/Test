package com.vitthal.java.collection.queuedemo;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemo1 {
    public static void main(String[] args) {

        Queue q = new LinkedList();
        // upcasting - : creating the LinkedList object and assigning to QUeue super type
        // linked list is going to behave like queue

        //List l = new LinkedList(); // linked list is going to behave like List

        q.add("vitthal");
        q.add("bulbule");
        q.add("Amruta");
        q.add("chougule");
        System.out.println(q);

        /*System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);*/

        q.remove();
        System.out.println(q);
        System.out.println(q.isEmpty());
        System.out.println(q.size());

    }
}
