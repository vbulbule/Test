package com.vitthal.java.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

       boolean bln = isAnagram("keep","peek");
       if(bln)
           System.out.println("Both the strings are Anagram");
       else
           System.out.println("Strings are not anagram");
    }

    public static boolean isAnagram(String val1, String val2){
        /*
        Ex
        val1 = keep
        val2 = peek

        1. we can sort both strings alphabetically
        2. verfy the each and every characcter with the other string
         */

      String sortedVal1= sortString(val1);
      String sortedVal2= sortString(val2);

      return sortedVal1.equals(sortedVal2);

    }

    public static String sortString(String val){
        /*
        we can iterate the string and take one chara and compare with other one
        if its less then we can swap
        // we can add the bubble sorting mechanism
         */
        char[] charArray = val.toCharArray();
        for(int i =0;i<charArray.length;i++){
            for(int j =0;j<charArray.length;j++){
                if(i==j)
                    continue;
                if(charArray[i] < charArray[j]){
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j]= temp;
                }

            }
        }
        return new String(charArray);

    }
}
