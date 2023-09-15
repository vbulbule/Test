package com.vitthal.arrays;

import java.util.Arrays;

public class Demo11 {

    public static void main(String[] args) {

        /*
        Syntax:
        ArrayType [] arrayName = new ArrayTYpe[size];
        */

        int[] intArray = new int[5];
        System.out.println("size of intArray : " + intArray.length);
        System.out.println(Arrays.toString(intArray));
        intArray[0]=1;



        int[] intArray2 = {1, 2, 3, 4, 5, 6};
        System.out.println(intArray2.length);

        // intArray2[7]= 8; /it will throw arrayIndexoutOfbound

        System.out.println(intArray2.toString());






    }
}
