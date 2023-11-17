package com.vitthal.java.arrays;

public class Demo9 {


    public static void main(String[] args) {

        int[] array = {7, 3, 6, 8, 2, 10, 1, 40, 23};

        //output
        System.out.println("------before sort ------");
        printArray(array);
        int[] sortedArray = sortArray(array);
        System.out.println("------after sort ------");
        printArray(sortedArray);
        //sorted array
        //1,2,3,6,7,8,10,23,40

    }

    public static int[] sortArray(int[] a){

        for(int i =0 ; i<a.length;i++){
            for(int j =0;j<a.length;j++){

                if(i==j)
                    continue;
                else{
                    if(a[i]< a[j]){
                        // perform swap operation
                        int temp;
                        temp = a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }

                //System.out.println("i value :"+a[i] +"i index :"+i+"||"+"J value :"+a[j]+"j index :"+j );

            }
            //System.out.println("-------------------------------------------------");
        }

        return a;
    }

    public static void printArray(int[] a){

        for (int i : a ){

            System.out.print(i+ " ");
        }
        System.out.println();
    }

}
