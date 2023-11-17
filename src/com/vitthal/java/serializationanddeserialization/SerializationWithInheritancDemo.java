package com.vitthal.java.serializationanddeserialization;
import java.io.*;
public class SerializationWithInheritancDemo {
    /*
    if class implements Serializable interface then all its subclasses also will be serializable.
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //serilization
        Employee emp1 = new Employee(122,"Amruta","HomeWorker","housewife");
        FileOutputStream fout = new FileOutputStream("C:\\Users\\vitbulbu\\IdeaProjects\\Test\\resources\\serilizationinheritancedemo.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(emp1);
        out.flush();
        System.out.println("Success...");

        // deserilization

        FileInputStream fin = new FileInputStream("C:\\Users\\vitbulbu\\IdeaProjects\\Test\\resources\\serilizationinheritancedemo.txt");
        ObjectInputStream in = new ObjectInputStream(fin);

        Employee e1 = (Employee) in.readObject();
        System.out.println("ID :"+e1.id+" | "+"Name :"+e1.name+" | Designation :"+e1.designation+" | Department :"+e1.department);
        in.close();
    }

}
