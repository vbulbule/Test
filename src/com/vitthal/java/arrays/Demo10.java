package com.vitthal.java.arrays;

public class Demo10 {
    public static void main(String... args) {

        /**
         *
         * IMPORTANT :
         * Q what is the difference between ... and []
         * 
         * ... means variable no of arguments
         * [] -> array
         *
         * if we use [] in and as method perameter we should pass array object or array variable
         * if we use ... as method parameter we can pass array object or array variable or variable
         * no of arguments
         *
         *
         */
        //System.out.println("Vitthal is sad");

        int[] arr1 = {10,20,30,40,50};
        System.out.println(add(arr1));
        System.out.println(add(new int[]{4, 6,5,7,8,9}));
        System.out.println("------------------");
        System.out.println(add1(arr1));
        System.out.println(add1(new int[]{4, 6,5,7,8,9}));

        System.out.println(add1(12,1,3,5,7,8,1,0));



    }



    static int add(int[] arr){ // using array as parameter
        int sum =0;
        for(int i : arr)
        {
            sum = sum+i;
        }
        return sum;
    }

    static int add1(int... arr){ // using ... as parameter

        int sum =0;
        for(int i : arr)
        {
            sum = sum+i;
        }
        return sum;
    }

}
