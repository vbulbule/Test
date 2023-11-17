package com.vitthal.selenium.session8;

import java.util.Arrays;

public class Session8 {
    /*

    before performing action on any element we have to inspect the element
    to identify or find the element

    Inspecting the element

    - fetching the source code of element which is use to develop particular element is
      called as inspecting the element

    - to inspect or to open the dev toll in chrome browser

    1. right click on the website
    2. select the inspect option from the list
    3. dev toolbox will be opened
    4. select the element section to view the all elements


    there is shortcut for inspecting the element or to open the devtools
    Press F12 will be open the devtools

    In some of the application such as IRCTC for security purpose devolopers
    will disable the right click option
    in such cases we can simply click F12

     */

    public static void main(String[] args) {

        String[] array = {"Vitthal","vitthal","amruta","gill","yash","vinay","vinAy","amrUta"};
        String[] result = new String[5];
        int couter =0;

        System.out.println(checkIfArrayIsEmpty(result));

        for(int i = 0;i < array.length;i++){

            if(checkIfArrayIsEmpty(result)){
                result[0]=array[i];
                couter++;
            }
            if(!checkIfArrayIsEmpty(result)){

                if(! checkIfStringIsPresentInArray(result,array[i])){
                    result[couter]= array[i];
                    couter++;
                }
                // check the result array if the array[] value is present or not
            }
        }
        System.out.println(Arrays.toString(result));
    }

    public static boolean checkIfArrayIsEmpty(String[] str){

        int counter=0;

        for(int i =0;i < str.length; i++){

            if(str[i]==null){
                counter++;
            }

        }

        if(counter == str.length)
            return true;
        else
            return false;
    }

    public static boolean checkIfStringIsPresentInArray(String[] str, String valueToBeChecked){

        for(int i =0; i< str.length;i++){

            if(str[i]==null){
                str[i]="";
            }

            String lowercaseStringfromArray = str[i].toLowerCase();
            String valueToBeCheckedLowercase= valueToBeChecked.toLowerCase();
            if(lowercaseStringfromArray.equals(valueToBeCheckedLowercase)){
                return true;
            }


        }

        return false;

    }
}
