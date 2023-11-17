package com.vitthal.java.problems;

public class Regex {

    public static void main(String[] args) {

        String str1 = "Saket Saurav        is an Autom ation Engi ne      er";

        System.out.println(str1.replaceAll("\\s+"," "));
    }
}
