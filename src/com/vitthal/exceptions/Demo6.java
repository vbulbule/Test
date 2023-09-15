package com.vitthal.exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Demo6 {
    /*
    if 2 exceptions class in catch block and they are subclass and super class then
    first subclass exception need to be catched and then superclass excpetion

    multiple catch block can catch exceptions of different types and should not have relationship

    NOTE :  you cannot have base and derived type in multicatch block

    when you need to handle exceptions where one exception is base class and other is derived then
    providing the base class alone is enough as it will be handled the derived also

    if we want to cath the multiple exception in single catch block also
    using or (|) we can call the multiple exception in single catch block

   for ex : catch (NoSuchElementException | IllegalArgumentException e){
         // statement
        }

     */
    public static void main(String[] args) {

        String str = "12.56";
        Scanner sc = new Scanner(str);
        int i=0;
        try{
           i = sc.nextInt(); // input missmatch exception // Nosuch element
        }

        catch (InputMismatchException e){
            System.out.println("inside input missmatch");
        }
        catch (NoSuchElementException e){
            System.out.println("inside no such element catch");
        }
        catch (IllegalArgumentException e){
            System.out.println("inside IllegalArgumentException catch");
        }
    }
}
