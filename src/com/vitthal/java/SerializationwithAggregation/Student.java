package com.vitthal.java.SerializationwithAggregation;

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    String name;

    Address address; // HAS A relationship

    public Student(int id, String name ,Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
