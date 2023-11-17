package com.vitthal.java.threads;

public class ThreadExample6 extends Thread{
    /*
     public void join()
     It causes the current thread to block until the second thread terminates
     or the specified amount of milliseconds passes.
     */

    @Override
    public void run() {
        for (int i =1;i<=4;i++){
            try {
                Thread.sleep(2000);
                System.out.println("Current Thread: "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(e);
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadExample6 t1 = new ThreadExample6();
        ThreadExample6 t2 = new ThreadExample6();
        t1.start();
        t1.join();
        t2.start();
    }
}
