package com.vitthal.java.exceptions;

public class Demo20 extends Demo19{

    void print() throws Exception {
        System.out.println(" vitthal");
    }
    /*
    when a statement generates checked exception u can handle using
    try-catch and
    throws declaration after method paranthesis

    in throws declaration you should use the exception class name or relavent exception class name

    ex : if SQL excpetion is thrown we should declare ussing THrows SQL exception or
    we can declare using its parent class eception also ex : throws Exception

    WHen we override a method which throws an excpetion we need not once again declare throws exception class
    or
    we can declare with same exception class as declared in super class
    or
    we can declare with most specific class (child class) but we cannot declre throws with new exception class

     */
}
