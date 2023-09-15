package com.vitthal.exceptions;

public class Demo9 {
    /*
    when you want to catch an excception and throw another exception you can chain the
    first exception to the throwing exception can rethrow same exception
     */
    public static void main(String[] args) {
        try {
            print();
        }
        catch (RuntimeException e){
            System.out.println("in main catch");
            System.out.println(e.getClass());
            System.out.println(e.getCause());
        }
    }
    public static void print()  {
        try {
            String[] str = {"Hello"};
            System.out.println(str[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            //how to generate the exception on your own?
            throw new RuntimeException(e);
        }
    }




}
