package com.vitthal.exceptions;
public class Demo10 {
    public static void main(String[] args) {
        System.out.println(test());
    }

    static String test(){

        int i =10;
        int j =0;
        try{
            j = i/0;
            return "PASS";
        }
        catch (ArithmeticException e){
            return "FAIL";
        }

    }
    //how we use the exception in selenium automation

   /* public static void loginFacebook(String email, String password){

        try {
            enterEmail(email);
            enterPassword(password);
        }
        catch (Exception e){
            throw  new RuntimeException("Email or password fileds are not entered please check");
        }

    }*/
}
