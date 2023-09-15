package com.vitthal.exceptions;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        /*
        we have resources inside the paranthesis of try block compiler will internally conveert try with
        resources to finally block
        if catch is present it will be retained once work is done resources are
        automitally closed dont close it explicitely
         */
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter num");
            int i = sc.nextInt();
        }
        catch (Exception e){
            System.out.println("inside catch");
        }
        finally {
            System.out.println("in finally");
        }
    }
}
