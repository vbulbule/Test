package com.vitthal.java.exceptions;

public class Demo24 {

    /*
    finalize() method?
    this is the protected method of object class
    this method runs before the object is deleted by garbage collection
    */

    public static void main(String[] args) throws Throwable {

    }
    protected void finalize() throws Throwable {

        super.finalize();
        System.out.println(" finalize is called ");
    }

}
