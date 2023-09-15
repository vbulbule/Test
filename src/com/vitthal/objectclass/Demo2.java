package com.vitthal.objectclass;

public class Demo2 {

    public static void main(String[] args) {
        Orange o1= new Orange();
        System.out.println(o1.toString()); // print the address  when we use thee print statement compiler
                                // automaticallly call the .toString method
       // System.out.println(o1.toString()); // print address

        String s1 = new String("Vitthal");
        System.out.println(s1.toString());// prints value
        /*
        in String class toString method is overriden to print the string value
        when we print any string automatically s1.toString() method will be called
        and toString method is overriden in String class to print the value
        that why we get output as 'Vitthal'
         */




    }
}
