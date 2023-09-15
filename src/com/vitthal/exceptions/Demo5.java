package com.vitthal.exceptions;

public class Demo5 {
/*
   single try block can have multiple catch block
 */
    public static void main(String[] args) {
        try{

            int i =10;
           // i= i/0;
            int k = Integer.parseInt("test");

        }
        catch (ArithmeticException e){
            System.out.println("inside Arithmatic excception catch block");
            //catch block 1
        }
        catch (NumberFormatException e){
            System.out.println("inside numberformat exeption catch block ");
            //catch block 2
        }

    }
}
