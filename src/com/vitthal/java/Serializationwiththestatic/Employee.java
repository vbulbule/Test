package com.vitthal.java.Serializationwiththestatic;

import java.io.Serializable;

public class Employee implements Serializable {

    int id;
    String name;
    static String company ="Vodafone"; // it wont be serialized

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
