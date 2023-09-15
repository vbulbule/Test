package com.vitthal.wrapperclasses;

public class C {

    //overloaded method
    void test(double d){
        System.out.println("double argumt method");
    }

    void test(Integer intObj){
        System.out.println("Integer argumt method");
    }

    void test(Number num){
        System.out.println("Number argumt method");
    }

    void test(Object obj){
        System.out.println("Object argumt method");
    }
    void test(int i){
        System.out.println("int argumt method");
    }
}
