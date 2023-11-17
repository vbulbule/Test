package com.vitthal.java.threads;

public class ThreadExample2 implements Runnable{

    String name;
    Thread thread;

    public ThreadExample2(String name) {
        this.name = name;
        thread = new Thread(this,name);
        System.out.println("A new Thread "+thread+" is created ");
        thread.start();
    }

    @Override
    public void run() {

        try {
            for (int i =0;i<5;i++){
                System.out.println(name+": "+i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println(name + " Thread Interrupted");
        }
        System.out.println(name+" Thread exiting");
    }
}
