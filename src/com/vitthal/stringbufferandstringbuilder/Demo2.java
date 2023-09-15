package com.vitthal.stringbufferandstringbuilder;

public class Demo2 {



    public static void main(String[] args) {
        StringBuilder sb6 = new StringBuilder("Selenium");
        System.out.println(sb6);
        StringBuilder sb1;
        System.out.println(sb1 = sb6.insert(4, "HAHA"));
        System.out.println(sb6);
        System.out.println(sb1);
        System.out.println("----------------------------------------");
        System.out.println(sb6 == sb1);
        System.out.println(sb6.equals(sb1));
        System.out.println("------------------------------------------");
        StringBuilder sb12 = new StringBuilder("Hello");
        StringBuilder sb13 = new StringBuilder("Hello");
        System.out.println(sb13.equals(sb12));
        // equals method not overriden so it will compare address
        System.out.println("----------------------------------------");
        //String s = sb6; // not possibllle since they are of different class
        // assigining the string buffer content to string class that is not possible

        String s = sb1.toString();
        // assigning string to string buffer class
        StringBuffer sb7 = new StringBuffer("Hello");
        sb7.append("banglore");
        System.out.println(sb7);
    }

}
