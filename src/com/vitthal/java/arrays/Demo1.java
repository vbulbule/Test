package com.vitthal.java.arrays;

public class Demo1 {

    int i =10; // premitive
    short s = (short) 12.30; // premitive
    public static void main(String[] args) {
        /**
         *
         * ARRAYS : Arrays are the objects in java that will stores the multiple values of the same type
         * arrays can hold the either primtive or object references but array itself as an object even if
         * the array is decalred to hold the primitive element
         *
         *
         */

        // how to declare an array
        //syntax : arraytype [] arrayName = new arraytype[size];

        int arrayName[]; // only declaration

        int[] arrayName2 = {1, 3, 4, 5, 6}; // array decalaration with initialization

        // expamples
        int age[] = new int[10];
        int [] marks = new int[40];

        int scores[];
        scores = new int[20];

        int[] marks2 = {1, 2, 3, 4, 5};
        int[] marks3 = new int[] {3, 5, 6,7, 8,9, 10};

        /**
         * NOTE :
         * 1. if you are declaring array and constructing the array in same line then you should declare the size
         * 2. Index of an array is starts with 0 means if the size of array is 3 then index will be 0 1 and 2
         * 3. Array are fixed in size. though you can create array object dynammically but once an array object is created
         * we cannot increase or decrease the array size
         *
         *
         */

        // how to declare empty array
        int age2[] = new int[0]; // size
        int[] marks5 = {};
        int[] marks6 = new int[] {};
    }
}
