package com.vitthal.java.collection.hashsetdemo;

import com.vitthal.java.collection.Book;

import java.util.HashSet;

public class HashSetDemoOfBook {
    public static void main(String[] args) {

        HashSet<Book> bookSet = new HashSet<>();

        Book b1 = new Book(101,"Marathi","Vitthal Bulbule", "VM Publisher", 10, 200);
        Book b2 = new Book(102,"English","Amruta", "VN Publisher", 20, 300);
        Book b3 = new Book(103,"Hindi","Suraj", "VO Publisher", 30, 400);
        Book b4 = new Book(104,"Sanskrit","Akshay", "VP Publisher", 40, 500);
        Book b5 = new Book(102,"English","Amruta", "VN Publisher", 20, 300);
        Book b6 = new Book(102,"English","Amruta", "VN Publisher", 20, 300);
        Book b7 = new Book(101,"Marathi","Vitthal Bulbule", "VM Publisher", 10, 200);
        Book b8 = new Book(101,"Marathi","Datta Bulbule", "VM Publisher", 10, 200);


        b1.equals(b2);

        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);
        bookSet.add(b4);
        bookSet.add(b5);
        bookSet.add(b6);
        bookSet.add(b7);
        bookSet.add(b8);

        for (Book b : bookSet){
            System.out.println(b.id+ " "+ b.name+ " "+ b.author+ " "+b.publisher+ " "+b.quantity + " "+b.price);
        }


    }
}
