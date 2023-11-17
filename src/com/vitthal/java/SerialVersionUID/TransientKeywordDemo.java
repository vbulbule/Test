package com.vitthal.java.SerialVersionUID;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TransientKeywordDemo {
    /*
    Java transient Keyword
    in java Serialization is used to convert the object into stream of the bytes
    The byte stream consists of th data of the instance as well as type of data stored in that instance.
    Deserialization performs exactly opposite operation. It converts the byte sequence into original object data.

    During the serilization when we do not want an objectt to be serilize we can use the transient keyword

    Why to use the transient keyword?
    The transient keyword can be used with the data members of a class in order to avoid their serialization.
    For example, if a program accepts a user's login details and password.
    But we don't want to store the original password in the file.
    Here, we can use transient keyword and when JVM reads the transient keyword it ignores
    the original value of the object and instead stores the default value of the object.

    Syntax :
    private transient <mamber_variable>

     */

    public static void main(String[] args) throws IOException {

        Student s1 = new Student(345,"Amruta",99);

        // writing the object into file

        FileOutputStream fout = new FileOutputStream("C:\\Users\\vitbulbu\\IdeaProjects\\Test\\resources\\transientdemo.txt");

        ObjectOutputStream out = new ObjectOutputStream(fout);

        out.writeObject(s1);
        out.flush();
        out.close();
        System.out.println("Success..!");

    }
}
