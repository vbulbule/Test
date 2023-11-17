package com.vitthal.java.exceptions;

public class InvalidAgeException extends RuntimeException {

    InvalidAgeException(String str){
        System.out.println(str);
    }
}
