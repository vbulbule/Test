package com.vitthal.java.arrays;

public class Demo2 {
    public static void main(String[] args) {

        int[] array = new int[3];
        array[0]= 10;
        array[1]= 20;
        array[2]= 30;

        for(int i =0 ; i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("------------------");

        String[] stringArray = new String[3];
        stringArray[0]="Vitthal";
        stringArray[1]="is";
        stringArray[2]="Sad :(";

        /*for (int i =0;i<stringArray.length;i++){
            System.out.print(stringArray[i]+" ");
        }
        */

        // enhance for loop
        for(String s : stringArray){
            System.out.print(s+" ");
        }



    }
}
