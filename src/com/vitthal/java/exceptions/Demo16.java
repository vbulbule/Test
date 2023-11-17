package com.vitthal.java.exceptions;

public class Demo16 {
    public static void main(String[] args) {

        /*

        type of ecceptions
        1. checked exception
        2. unchecked exceptions

        Checked exception : An exception which the compiler can check at the time of compilation
        is known as checked exception

        checked exception can be handled using try-catch or throws keyword along with the
        method through exception name. It shoud be written in the method name after the closing paranthesis

        ex : 1. public static print (String val ) throws ExceptionName
        {

        }
        2. public static print(){
        try{
        }
        catch(ExceptionName e){
        }

        }

        Unchecked :

                                            Object
                                              |
                                           Throwable
           --------------------------------------------------------------------
           | 1                                                                  | 3
         Error                                                             Exception
           |                                           -------------------------
           |                                         2 |                        |
           |                                      RunTimeException        ClassNotFoundException
        OutOfMemoryError                               |                        |
           |                                     ArimethicException      IOException
        NoSuchMethodError                              |                        |
           |                                     ClassCastException      SQLException
        StackOverflowError                             |
                                                 NullPointerExcception


        1 and 2 : Unchecked Exception
        3       : Checked Exception


        1. if we get the IOException we can catch argument of same class or its super class Exception
        2. FOr nullpointerexception use same class or runtime exception or throwable
        3. What is error?
         - Error is subclass of throwable class that indicates a abnormal conditions
         which can cause serious problems

         ex: Stackoverflowerror : when we use method recursion
         NOTE: throwable is the base class of all Exception class and its super class is Object class



         */

    }

}
