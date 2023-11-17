package com.vitthal.java.collection;

public class Orange implements Fruit{

    public boolean equals(Object o){

        if(o instanceof Orange)
            return true;

        return false;
    }
}
