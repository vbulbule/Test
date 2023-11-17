package com.vitthal.java.SerializationwithAggregation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationWithAggression {
    /*

    Java Serialization with Aggregation (HAS-A Relationship)

    IS A relationship ex : Person is a employee
    HAS A relationship ex : Person Has a Address; Employee has a Salary

    If class has reference to another classs, all the references must be Seriliazable otherwise serialization
    process will not be performed.
    In such case NotSerializableException is thrown at runtime



     */

    public static void main(String[] args) throws IOException {

        Address add = new Address("Ganpati Mandir","Mumbai","Maharashtra");
        /*
        Creation of student object will require the ID , Name and Address (Address TYpe class)

        the Student class is serializale but the Address class is not Serilizable

        so when we try to serilize the Student Object it will throw an Exception to NotSerializableException

        so when we want to serilize and if there is any referenes of another class in the object which we gonna
        serilize then all those classes should implement Serilizable interface

         */

        Student s1 = new Student(234, "Amruta",add);

        FileOutputStream fout = new FileOutputStream("C:\\Users\\vitbulbu\\IdeaProjects\\Test\\resources\\SerializationwithAggregation.txt");

        ObjectOutputStream out = new ObjectOutputStream(fout);

        out.writeObject(s1);



    }
}
