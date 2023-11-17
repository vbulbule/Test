package com.vitthal.java.serializationanddeserialization;

import java.io.*;

public class SerilizationDemo {
    /*

    Serialization in Java
    - is a mechanism of writing of the state of an object into a byte-stream.
    - mInly used in Hibernate, RMI , JPA, EJS and JMS

    Deseriliazation in java
    - the reverse operation of serilization is called Deseriliazation
    - where byte-strem is converted into your object

    The Serialization and Deseriliazation process is platform-independent
    - means you can Serialize object on one platform and Deseriliaze on another platform


    for Serialization of the object we call writeObject() method of ObjectOutputStrem class
    for deSerialization we call redObject() method of ObjectInputStrem class

    IMPORTANT : We must have to implement the Serializable interface for seriliazing the object

    What are Advantages of Java Serialization
    -it is mainly used to travel object's state on the network

    for seriliazation we nned to implement the Serializable interface

    package : java.io.Serializable : interface
    Marker Interface (has no data mambers and methods).
    It is used to "mark" java classes so that the objects of these classes may get certain capability.

    the "Cloneable" and "Remote" als also the Marker Interface

    The Serializable interface must be implemented by the class whose needs to persisted.

    The String class and all the wrapper classes implement the java.io.Serializable Interface by default

    - What is ObjectOutputStrem class
      - the ObjectOutputStrem is used to werite the primitive data types and java objects to an OututStrem
      - only Objects that supports the java.io.Serializable interface can be written to streams

      Method : writeObject(), flush(), close();
      Constructior : ObjectOutputStream(OutputStream out)

    - ObjectInputStream class
     - An ObjectInputStream deserializes objects and primitive data written using an ObjectOutputStream

     Method : readObject(), flush(), close()
     Constructor : ObjectInputStream(InputStream in)


     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Serilisation
        Student s1 = new Student(1, "Amruta");
        // to serilize your object we need to implement the Serilizable interface
        // otherwise that object will not support the Serilization

        FileOutputStream fout = new FileOutputStream("C:\\Users\\vitbulbu\\IdeaProjects\\Test\\resources\\serilizedemo.txt");

        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(s1); // this method will serilize the S1 object and S1 is object of class
        // student and student class in implementing the Serializable Interface
        //serilization will not be supported if your class is not implementing the Serializable Interface
        out.flush();
        System.out.println("Success");
        out.close();


        // ---- deserilization ----

        FileInputStream fis = new FileInputStream("C:\\Users\\vitbulbu\\IdeaProjects\\Test\\resources\\serilizedemo.txt");
        ObjectInputStream in = new ObjectInputStream(fis);

        Student s = (Student) in.readObject(); // deserilization
        /*
        readObject() method return the Object type
        if you know that which type of object is returns the readObject() then we can cast to that type
        and deserializable the serializable Object
        for example here we are de-serializing the Student class object hence we have cast to the Student class
        like :in.readObject(); : we know that it will return the Student class object
        so casted to Student class like : (Student) in.readObject();
         */
        System.out.println("Student ID :"+s.id);
        System.out.println("Student Name :"+s.name);

        in.close();


    }

}
