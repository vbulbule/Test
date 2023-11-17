package com.vitthal.java.exceptions;

public class Demo11 {

    public static void main(String[] args) {

        System.out.println(test());
    }


    public static String test(){

        int i =10;

        try{
            i=i/0;
            return "PASS";
        }
        catch(ArithmeticException e){
            return "FAIL";
        }
        finally {
            return "PASSFAIL";
        }

    }

    /*
    you can have the return statement in
    try - chatch or
    try - finally or
    only outside or
    try-catch-finally
    catch-finally or
    catch and outside

    if you have return in finally and outside finally block or in try - catch and outside catch block
    then it becomes unrechable code
     */

  /*  public static String print(){

        int i=10;
        try{
            i=i/0;
            return "PASS";
        }
        catch(ArithmeticException e){
            return "FAIL";
        }
        *//*finally {
            return "PASSFAIL";
        }*//*

        return "OUTSIDE"; // unreachable statement
    }*/


    /* Exception Handling

     1. An exception is an event triggered when JVM is not able to execute a
     statement handling the event is known as excception handling

     2. WHenever excception occurs JVM terminates the execution by throwing the excetion
     message

     3. In order to complete the execution the exception should be handled by using try-catch block

     4. Always tr ty-catch block should be written in sequence

     5. try block alone is not allowed

     6. catch should take an argument of type exception

     7. try block should contain the statements which generates exception. once an exception has
     occured JVM will go to the catch block, remaining portion of the try block will never be executed

     8. in the catch body we can print the object or we can print the entire exception trace.
     After executing the catch body the execution contineous from the remaining program

     9. in between try and catch block no other executable statements are allowed

      */




}
