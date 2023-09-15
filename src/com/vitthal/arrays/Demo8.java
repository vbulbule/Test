package com.vitthal.arrays;

public class Demo8 {
    /**
     * Q How do you pass array in a method?
     *
     *
     *
     */

    public static void main(String[] args) {

        print("Vitthal is sad");

        String[] str = new String[6];
        str[0]="Amruta is very bad in java";
        str[1]="Vitthal is very genius in java";

        printArray(str);

    }

    public static void print(String s){
        System.out.println("String val  :"+s);
    }

    public static void printArray(String[] array){

        for (int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
