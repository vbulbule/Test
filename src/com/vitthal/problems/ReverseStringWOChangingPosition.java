package com.vitthal.problems;
public class ReverseStringWOChangingPosition {
    public static void main(String[] args) {
        System.out.println(reverseStringWOChangingPosition("Sunil stays in mumbai"));
    }
    public static String reverseStringWOChangingPosition(String val){

        /*
        sunil stays in mumbai
        iabmu mnisy at slinus
         */

        int start = 0;
        int end = val.length()-1;

        char[] array = val.toCharArray();

        while (start < end){

            if(Character.isAlphabetic(array[start]) && Character.isAlphabetic(array[end])){
                char temp = array[end];
                array[end]= array[start];
                array[start]= temp;
                start++;
                end--;
            }
            if(!Character.isAlphabetic(array[start]))
                start++;
            if(!Character.isAlphabetic(array[end]))
                end--;
        }
        return new String(array);
    }
}
