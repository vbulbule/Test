package com.vitthal.java.threads;

public class ThreadExample4 extends Thread {
    /*
    public static void sleep()
    this blocks the curent running thread for the specific amount of time
     */

    @Override
    public void run() {
        for(int i =1;i<5;i++){
            try {
                System.out.println("i value :"+i);
                System.out.println("Sleeping.....!");
                System.out.println("------------------------------");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadExample4 t1 = new ThreadExample4();
        ThreadExample4 t2 = new ThreadExample4();
        t1.start();
        t2.start();
    }
}
