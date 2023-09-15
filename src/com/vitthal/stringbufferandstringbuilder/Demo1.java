package com.vitthal.stringbufferandstringbuilder;

public class Demo1 {
    /*

    String is : im mutable
    but
    String buffer and builder are mutable classes and these two are alternate to the string class

    String buffer is synchronize
    string builder is non synchronize
     */

    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer();
        //sb1 = "hello"; // not possible
        //why ? because "" is belongs to string class
        sb1.append("Hello");

        StringBuffer sb2 = new StringBuffer("Banglore");

        System.out.println(sb1 + " "+ sb2);

        System.out.println(sb1.reverse());
        System.out.println(sb1);

        StringBuffer sb3 = sb2.reverse();

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);

        System.out.println(sb3 == sb2);

        sb1.setLength(0); // to set the new length for string buffer
        System.out.println("sb1 : "+sb1);

        System.out.println("-------------------------------------------------");
        StringBuffer sb4 = new StringBuffer("I love you java");
        String str = sb4.delete(7, 11).toString();
        System.out.println(str);

        StringBuffer sb5 = new StringBuffer("I love you java");
        String str2 = sb5.deleteCharAt(11).toString();
        System.out.println(str2);

        sb4 = new StringBuffer();
        System.out.println(sb4.length());
        System.out.println("-----------------------");
        sb4.append("javadeveloper");
        sb4.insert(4, "HAHA");
        System.out.println(sb4);

        // to insert aat the end
        sb4.insert(sb4.length(),"hurrrree");
        System.out.println(sb4);
        // to insert at the start
        sb4.insert(0,"AMRUTA");
        System.out.println(sb4);

        sb4.delete(4,6);
        System.out.println(sb4);
        sb4.deleteCharAt(0);
        System.out.println(sb4);

    }
}
