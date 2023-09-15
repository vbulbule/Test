package com.vitthal.exceptions;

public class Demo13 {
    public static void main(String[] args) {

        /*
        -Generation of exception?
    During execution of any program if JVM finds any abnormal statement or any statemment which
    generates exception then it collects the information and looks for the type (class) matching the exception.
    once the match is found JVM creates an object of the class with the details and throws the object
    in catch block. the argument type should be same type of the object raised or its super type.
    if the exception is not handled JVM will quite the execution

    NOTE: when an exception is thrown it can be caught by reference variable of the same class or its super class
    or its super class... in the catch block
         */
        try{
            int i = 10/0; // this statement will throw the exception
                          // Arithmatic exception
                          // JVM will collects the details which type of exception what are the detailsnall
                          // Object of the what class exception is occuring
                          // ArithmeticExcetion  : create the object of arithmeticException classs
                          // JVM will throw the ArithmaticException class object
        }
        catch (RuntimeException e){
            /*
            we can use the Runtime exception
            because
            the exception generating in try block is the Arithmatic exception
            and we are catching it in RUntime exception

            RuntimeException is super type of ArithmeticException
            so we can user either super type of the throwing exception or the exception generated class type
             */

        }

    }
}
