package com.vitthal.objectclass;

public class A extends Object {
    int i =100;

    /*
    if class A is not extending to anyone then its automatically extends to Object class

     */
    //This default constructor compiler will declare it on our behalf

    A(){
        super(); // belonggs to Object class constructor
    }

    public String toString(){

        return "i = "+i;
    }
}
