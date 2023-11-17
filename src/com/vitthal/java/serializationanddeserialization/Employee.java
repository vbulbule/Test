package com.vitthal.java.serializationanddeserialization;

public class Employee extends Person{
    String department;
    String designation;

    public Employee(int id, String name, String department, String designation) {
        super(id, name);
        this.department= department;
        this.designation= designation;

    }
}
