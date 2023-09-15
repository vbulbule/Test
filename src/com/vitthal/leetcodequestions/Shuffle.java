package com.vitthal.leetcodequestions;

import java.util.Arrays;

public class Shuffle {

    /*
   Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
   Return the array in the form [x1,y1,x2,y2,...,xn,yn].
   Input: nums = [1,2,3,4,4,3,2,1], n = 4
   Output: [1,4,2,3,3,2,4,1]

  n nums then array size would be 2n
  for ex : if n = 4 then array size is = 8

  array = [1, 2, 3, 4, 5, 6, 7, 8 , 9 , 10] = 2n
           x1 x2 x3 x4 x5 y1 y2 y3 y4  y5
  n = 5;

  the op i want is : [1, 5, 2, 6, 3, 7, 4, 8, 5 ,10]
                      x1 y1 x2 y2 x3 y3 x4 y4 x5 y5

  Approach :
  1. i am going to convert the 2 arrays i.e
  1st array is of [x1, x2, x3, x4 ,x5] n = 5
  2nd array is of [y1, y2, y3, y4, y5] n = 5
  total array = 2n i.e 10

  i will be going to create an another array resultArray of size 2n i.e original size

  i willl be goint to add the alternate values to the resultArray
  but how i am i going to add??
  the x arrays will be going to add the even places of resultArray
  the y arrays will be going to add the odd places of resultArray

     */

    public static void main(String[] args) {

        int[] shufArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = shufArray.length/2;

        shuffleArray(shufArray,n);
    }


    public static void shuffleArray(int[] array, int n){

        int[] x_Array = Arrays.copyOf(array, n); // 0 to the n
        int[] y_Array = Arrays.copyOfRange(array,n,2*n); // last index any whay it will be 2n

        System.out.println("Origanal Array :"+Arrays.toString(array));
        System.out.println("X_Array :"+ Arrays.toString(x_Array));
        System.out.println("Y_Array :"+ Arrays.toString(y_Array));

        int[] resultArray = new int[2*n];
        int k =0;

        for(int i =0,j=1;i<resultArray.length;i+=2,j+=2){

            resultArray[i]=x_Array[k];
            resultArray[j]=y_Array[k];
            k++;
        }
        System.out.println(Arrays.toString(resultArray));



    }
}
