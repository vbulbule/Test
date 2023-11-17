package com.vitthal.java.threads;
public class ThreadExample3 implements Runnable {
    /*
    public void run()
    This thread is used to do an action for a thread.
    The run() method is instantiated if the thread was constructed using a separate Runnable object.
     */
    public void run() {
        System.out.println("Thread is Running ....... !!");
    }
    public static void main(String[] args) {
        ThreadExample3 t = new ThreadExample3();
        /* step1 : first we have have to create the object of class that thred needs to be created
           Step2 : created the object of Thread class using the new Thread(Runnable ) constructor
                   and ass the your runnable object (i.e ThreadExample3 because its implements Runnable)
         */
        Thread thread1 = new Thread(t);
        Thread thread2 = new Thread(t);
        Thread thread3 = new Thread(t);
        thread1.start();
        thread2.start();
        thread3.start();


    }
}
