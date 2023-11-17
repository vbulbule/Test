package com.vitthal.java.synchronization;

public class Notifier extends Thread{
    private Message msg;

    public Notifier(Message msg){
        this.msg=msg;
    }

    @Override
    public void run() {

        String name =  Thread.currentThread().getName();
        System.out.println(name + " started");
        try{
            Thread1.sleep(1);

            synchronized (msg){
                //msg.setMsg(name+ "notifier work is done");
                msg.notify();
                //msg.notifyAll();
            }


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
