package com.vitthal.java.exceptions;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {

        //example of finaly block
        Scanner sc = new Scanner(System.in);
        try{

            sc.nextInt();
        }
        catch (Exception e){
            System.out.println("inside Exception e");
        }
        finally {
            sc.close();
        }
    }
}
