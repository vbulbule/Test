package com.vitthal.java.collection;

import java.util.Objects;

public class Book {

    //b1  //101,"Marathi","Vitthal Bulbule", "VM Publisher", 10, 200
    public int id; // 101
    public String name;
    public String author;
    public String publisher;
    public int quantity;
    public int price;

    public Book(int id, String name, String author, String publisher, int quantity, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
        this.price = price;
    }

    @Override                 //b2
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;

        return id == book.id &&
                quantity == book.quantity &&
                price == book.price &&
                Objects.equals(name, book.name) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publisher, book.publisher);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, publisher, quantity, price);
    }
}
