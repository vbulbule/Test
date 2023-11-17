package com.vitthal.java.synchronization;

public class Thread4 extends Thread{

    Power p;

    Thread4(Power p){
        this.p=p;
    }

    @Override
    public void run() {
      p.printPower(2);
    }


}
