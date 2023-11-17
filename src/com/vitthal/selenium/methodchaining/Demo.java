package com.vitthal.selenium.methodchaining;

public class Demo {

    public static void main(String[] args) {
        Dog d = new Dog();


        // method chaining achive
        int val = d.getName().length();

        /*
        - d.getName() : is returning the String object
        - . : is used to call the methods or variables associated to the
            returning object
        - length() : as d.getName() is returns the String so using (.) operator
        we can able to access the methods of string class hence we are
        calling the length() method of string class
         */

    }

}
