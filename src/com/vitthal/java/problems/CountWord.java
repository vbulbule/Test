package com.vitthal.java.problems;

import java.util.Arrays;

public class CountWord {
    public static int getWordCount(String val){

        /*
        Assure the words are sepetared by space
         */
        String[] array = val.split(" ");
        System.out.println(Arrays.toString(array));

        return val.split(" ").length;
        //return 0;
    }

    public static void main(String[] args) {

        System.out.println(getWordCount("this  is the word count  program and  the words are seperated  by space"));
    }
}
