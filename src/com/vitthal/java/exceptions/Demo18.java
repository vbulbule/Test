package com.vitthal.java.exceptions;

import java.util.Scanner;

public class Demo18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age= sc.nextInt();

        try {

            if(age>=60 || age <=0){
                System.out.println("Invalid age : please enter age in betwen 1 to 59");
                throw new InvalidAgeException("Invalid Age Age should be in betwwn 1 to 59");
            }
            System.out.println("in the catch block");
        }
        catch (InvalidAgeException e){

            System.out.println("in the InvalidAgeException catch block");
        }

        System.out.println( "entered age is :"+age);
    }

    /*
    if we write our own wxceotion class put it under the class RuntimeException or Exception
    then it will be checked or unchecked based on the super class the user class extends

     */
}
