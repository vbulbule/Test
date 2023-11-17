package com.vitthal.java.exceptions;

public class Demo3 {
     /*
        alternately multiple statements can be handled using nested try catch
        first statement should be inside the inner try along with corresponding catch block and the second
        statement should be inside oouter try
         */
    public static void main(String[] args) {
        int i = 10;
        try
        {
            System.out.println("inside try block");
            try
            {
                System.out.println("inside inner try block");
                int k = Integer.parseInt("test");
            }
            catch (NumberFormatException e)
            {
                System.out.println("inside inner catch block");
            }
            System.out.println("back to the outer try block");
            i = i/0;
        }
        catch (ArithmeticException e){
            System.out.println("inside outer catch block");
        }

        System.out.println(" I :"+ i);
    }
}
