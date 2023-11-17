package com.vitthal.java.threads;

public class ThreadExample1 extends Thread{
    /*
    -----------------------------------
    using classs
    -------------------------------------
    Runnable (interface)
             |
          Thread (class)
             |
        ThreadExample1 (class)
    -----------------------------------------------------
     using idirect runnable interface
    -----------------------------------------
      Runnable (interface)
             |
        ThreadExample2 (class)


     */
    public void run(){

        int a = 10;
        int b= 12;

        int result = a+b;
        System.out.println("Thread is started Running .....!");
        System.out.println("Sum : "+result);

    }
}
