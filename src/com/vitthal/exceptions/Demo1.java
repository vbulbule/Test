package com.vitthal.exceptions;

public class Demo1 {
    /*
    Exception is an event that gets triggered when the JVM is not able to execute a statement
    it can be haldled using try- catch block
     */
    public static void main(String[] args) {
        int i =10;
        try{
            i = 10/0; // infinity
        }
        catch (ArithmeticException e){
           // e.printStackTrace();
            System.out.println(" hey i am in Arithmetic exception catch block and i have catched the exception");
        }
        System.out.println("execution is continued");
    }
}
