package com.vitthal.java.staticupcastingdemo;

public class A {
    /**
     *
     * Demo for upcasting and calling overriden method
     * overriden method will be called also we cannot access the subclass methods
     *
     */

    public void test(){
        System.out.println("test() implemented in A");
    }
    public void print(){
        System.out.println("print() implemented in A");
    }
}
