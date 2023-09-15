package com.vitthal.exceptions;

public class Demo4 {
    /*
    finalyy block is used along with try catch mostly or can be used along with try alone (try - finally)
    this block gets executed irrespective of a statement generating an exception or not
    we ccan have
    try catch
    try catch finally
    try finally
     */
    public static void main(String[] args) {
        int i = 10;
        try{
            System.out.println(" in try block ");

            i = i/2; // stmt will give the exception
        }
        catch (ArithmeticException e){
            // generated exception is catchec in catch block
            System.out.println(" in catch block ");
        }
        finally {
            System.out.println(" in finally block ");
        }
        System.out.println(i);
    }
}
