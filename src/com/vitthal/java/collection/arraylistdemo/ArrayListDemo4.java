package com.vitthal.java.collection.arraylistdemo;

import com.vitthal.java.collection.Chocolate;
import com.vitthal.java.collection.Strwberry;

import java.util.ArrayList;

public class ArrayListDemo4 {
    /*
    Calling methods of different objects in an Arraylist
     */
    public static void main(String[] args) {
        Chocolate ch = new Chocolate();
        ch.darkChocolate();
        ArrayList lst = new ArrayList();
        lst.add(new Chocolate());
        lst.add(new Chocolate());
        lst.add(new Chocolate());
        lst.add(new Chocolate());
        lst.add(new Chocolate());
        lst.add(new Strwberry());

        System.out.println(lst);

        for (Object o : lst){
            if(o instanceof Chocolate)
                ((Chocolate) o).darkChocolate();
            else if (o instanceof Strwberry) {
                ((Strwberry) o).cheeryStrwberry();
            }
        }

        ArrayList<Chocolate> list2 = new ArrayList();
        list2.add(new Chocolate());
        list2.add(new Chocolate());
        list2.add(new Chocolate());
        list2.add(new Chocolate());
        for (Chocolate ch1 : list2){
            ch1.darkChocolate();
        }

    }
}
