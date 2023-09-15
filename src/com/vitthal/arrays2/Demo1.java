package com.vitthal.arrays2;

import java.util.Arrays;

public class Demo1 {

    public static void main(String[] args) {
        //public static void main(String[] ...) {

        int[] a1 = new int[5];
        int[] a2 = {5,1,2,3,4};
        System.out.println(Arrays.toString(getReverseArray(a2)));
        System.out.println("Second Heighest : "+getSecondHeighestNumberInArray(a2));

    }

    // code reverse an array
    public static int[] getReverseArray(int array[]){

        int[] result = new int[array.length];
        int counter =0;
        for (int i = array.length-1;i>=0;i--){
            result[counter++]= array[i];
        }
        return result;
    }

    // find the second largest of an array

    public static int getSecondHeighestNumberInArray(int[] array){

        int HEIGHEST = Integer.MIN_VALUE;
        int SECOND_HEIGHEST = Integer.MIN_VALUE;

        for(int i =0;i<array.length;i++){

            if(array[i]>HEIGHEST){
                SECOND_HEIGHEST= HEIGHEST;
                HEIGHEST=array[i];
            }
            if(array[i]< HEIGHEST && array[i]> SECOND_HEIGHEST){
                SECOND_HEIGHEST= array[i];
            }

        }
        return SECOND_HEIGHEST;
    }


}
