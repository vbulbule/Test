package com.vitthal.java.arrays;

public class Demo13 {

    public static void main(String[] args) {

        int[] array =  {1, 2, 3, 4, 5, 6, 90 , 10 };
                    //  0  1  2  3  4  5
        System.out.println(getIndexOfNumberInArray(array, 90));
    }

    public static int getIndexOfNumberInArray(int[] array, int numberToGetTheIndex){

        for(int i =0;i < array.length;i++){

            if(array[i]==numberToGetTheIndex)
                return i;
        }
        return -1;
    }
}
