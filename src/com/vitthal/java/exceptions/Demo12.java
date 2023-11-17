package com.vitthal.java.exceptions;

public class Demo12 {
/*
   |        |
   |        |
   |test4        |
   |test3        |
   |test2        |
   |test1        |
   |d12        |
   |Main()        |
  -------------
      STACK
 */
    public static void main(String[] args) {

        Demo12 d12 = new Demo12();
        d12.test1();
    }

    void test1(){
        test2();
    }
    void test2(){
        test3();
    }
    void test3(){
        test4();
    }
    void  test4(){
        int i = 10/0;
    }
    /*
    when does stack unwinding happen?
    while executing any proram the method of the classes will be loaded into the stack for the execution purpose
    stack will be loaded with methods in the order the way it is called
    if the last entered method generates any exception then JVM looks for the the handler in the same method
    if no handler is found in the method then the exception propagates to the called mathod.

    in the called method if the exception is not handled the excception will propagetes to its
    called method till the exception reaches the main method

    if exception is not handled JVM will forcibly removes all the method from the stack and terminates the
    program execution this is known as stack unwinding

    -Generation of exception?
    During execution of any program if JVM finds any abnormal statement or any statemment which
    generates exception then it collects the information and looks for the type (class) matching the exception.
    once the match is found JVM creates an object of the class with the details and throws the object
    in catch block. the argument type should be same type of the object raised or its super type.
    if the exception is not handled JVM will quite the execution

    NOTE: when an exception is thrown it can be caught by reference variable of the same class or its super class
    or its super class... in the catch block

     */
}
