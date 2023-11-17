package com.vitthal.java.threads;

public class ThreadExample5 extends Thread {
    /*

    public static Thread currentThread()
    it returns the reference to the currently running thread
     */

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        ThreadExample5 t1 = new ThreadExample5();
        ThreadExample5 t2 = new ThreadExample5();

        t1.start();
        t2.start();

    }
}
