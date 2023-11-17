package com.vitthal.java.arrays;

public class Demo4 {
    /**
     * Arrays cane be cllassified as Primitive array and nonpremitive Array
     *
     * Default Values of array will be same as the default of the type declared
     * ex. if int arr[] then arr[0] will be 0as default for int
     *
     * if Apple apples[] then apple[0] will be null as a default for apple is null
     */

    public static void main(String[] args) {
        int[] intArray = new int[6]; // premitive array

        Apple[] apples = new Apple[6]; // non premitive array

        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();
        Apple a4 = new Apple();
        Apple a5 = new Apple();
        Apple a6 = new Apple();

        apples[0]=a1;
        apples[1]=a2;
        apples[2]=a3;
        apples[3]=a4;
        apples[4]=a5;
        apples[5]=a6;


    }
}
