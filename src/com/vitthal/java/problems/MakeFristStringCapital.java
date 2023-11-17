package com.vitthal.java.problems;

import java.util.Arrays;
import java.util.Collection;

public class MakeFristStringCapital {

    public static String makefirstStringCapital(String val){

        char[] array = val.toCharArray();
        array[0] = Character.toUpperCase(array[0]);

        return new String(array);
    }

    public static String makeFirstWordCapitalofScentence(String scentence){

        String[] array = scentence.split(" ");

        for (int i =0 ;i< array.length;i++){

            array[i]=makefirstStringCapital(array[i]);

        }
       return String.join(" ", array);
    }

    public static void main(String[] args) {

        String scentence = "amruta is very very bad girl";
        System.out.println(makeFirstWordCapitalofScentence(scentence));
    }
}
