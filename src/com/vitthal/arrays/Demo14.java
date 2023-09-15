package com.vitthal.arrays;

import java.util.Arrays;

public class Demo14 {
    /*

    2D Array
    two diminesional Array
    Syntax :

    Arraytype [] arrayname = new int[] // array deaclaration
     Arraytype [] []  arrayname = new int[][] // 2 D array
              row | coumn
     */

    public static void main(String[] args) {

        int[][] array = new int[4][3];
      /*
           0  |  1  |  2  | -> columns
    row-------------------------
      0| 00   |  01 |  02 |
     -------------------------
      1| 10   | 11  | 12  |
     -------------------------
      2| 20   | 21  | 22  |
     -------------------------
      3| 30   | 31 | 32   |
     -------------------------

       */

        System.out.println(array.length); // gives how many rows are present
        System.out.println(array[0].length); // no of colums in row 0
        System.out.println(array[1].length); // no of colums in row 1
        System.out.println(array[2].length); // no of colums in row 2
        System.out.println(array[3].length); // no of colums in row 3

        int val =10;

        for(int i =0 ;i < array.length;i++){
            for(int j =0; j<array[0].length;j++){

               // System.out.println("I value : "+i+" | J Value :"+j);
                array[i][j]=val;
                val+=10; // val = val+10

            }
            //System.out.println("______________________________________");

        }

        //System.out.println(Arrays.deepToString(array));


        int[][] array1 = { {1, 2, 3, 5}, {1, 4, 6,7}, {9, 8, 7, 6} };
        System.out.println(Arrays.deepToString(array1));

        /*
        Assignment :  print the Array using for each loop
        */

        System.out.println("---------------------------------------------------------------------");
        int [] arr1 = {10, 20 , 30 , 40 , 50 , 60 , 70 , 80 , 90 , 100};
        int [] arr2 = new int[5];

        System.arraycopy(arr1,2,arr2,1, 4);
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(arr2));


        /*
        How to create new array from exsisting array
         */

        int[] arr3 = Arrays.copyOf(arr1, 5);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = Arrays.copyOfRange(arr1, 3 ,8);
        System.out.println(Arrays.toString(arr4));





    }


}
