package com.vitthal.arrays;

public class Demo7 {

    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0]=10;
        for(int i : arr){
            System.out.println(i);
        }

        String[] strArray = new String[3];
        strArray[0]= "Hello";
        for(String s : strArray){
            System.out.println(s);
        }

        Apple[] apples = new Apple[3];
        apples[0]= new Apple();
        for (Apple a : apples){
            System.out.println(a);
        }
    }
}
