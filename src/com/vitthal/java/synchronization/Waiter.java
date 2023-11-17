package com.vitthal.java.synchronization;

public class Waiter extends Thread {

    private Message msg;

    public Waiter(Message m){
        this.msg=m;
    }

    @Override
    public void run() {

       String name =  Thread.currentThread().getName();

       synchronized (msg){
          try{
              System.out.println(name + " wating to get notified at time "+System.currentTimeMillis());
              msg.wait();
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }

           System.out.println(name + " waiter got notified at time :"+System.currentTimeMillis());
           //process the message
           System.out.println(name + " proccessed: "+ msg.getMsg());
       }

    }
}
