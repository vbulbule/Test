package com.vitthal.java.synchronization;

public class WaitNotifyTest {
    public static void main(String[] args) {

        Message msg = new Message("Amruta Is sick");

        Waiter waiter = new Waiter(msg);
        waiter.start();

        Notifier nf = new Notifier(msg);
        nf.start();

      /*  Waiter waiter1 = new Waiter(msg);
        waiter1.start();

        Notifier nf = new Notifier(msg);
        nf.start();*/



    }
}
