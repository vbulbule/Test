package com.vitthal.java.exceptions;

public class Demo2 {
    /*
    Handling multiple statement that can generate exception
    //use seperate try_cathch block
     */
    public static void main(String[] args) {

        int i = 10;
        try{
            i = i/0;
        }
        catch (ArithmeticException e){
            System.out.println("inside Atrithmatic exception catch block");
        }

        try{
            System.out.println("inside number format exception try block");
            int k = Integer.parseInt("test");
        }
        catch (NumberFormatException e){
            System.out.println("inside number format exception catch block");
        }
        System.out.println(i);




    }
}
