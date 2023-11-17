package com.vitthal.java.exceptions;

import java.sql.SQLException;

public class Demo19 {

    /*
    how to handle the checked exception
     */
    void print() throws Exception // super class off all exception
    {
        // line of code for to connect the SQL
         throw new SQLException();
       // int i = 10/0; // unckecd

    }
}
