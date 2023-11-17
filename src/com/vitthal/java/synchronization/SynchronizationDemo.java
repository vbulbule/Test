package com.vitthal.java.synchronization;

public class SynchronizationDemo {
    public static void main(String[] args) {

        Power p = new Power(); // only one object
        Power p2 = new Power();

        Thread1 t1 = new Thread1(p);
        Thread2 t2 = new Thread2(p);
        Thread3 t3 = new Thread3(p2);
        Thread4 t4 = new Thread4(p2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        /*
        Here the method of power is not synchronized so both the threads are executing at a time so in the
        output THread-0 is interfering with Thread-1 and hence we are getting the  in consistent result



        -Java Synchronized method
        if we use the "Synchronized" keyword in any method then that method is synchronized method

        -it is used to loack an object for shared resources
        -THe object gets the lock when synchronized method is called
        -The lock wont be released until the thread completes its function

        Syntax :
        synchronized void printPower(int n){

        }

        Access_modefiers synchronized return_type method_name (method_paramaeters){

        }


        -Synchronized Block
        Suppose you don’t want to synchronize the entire method,
        you want to synchronize few lines of code in the method,
        then a synchronized block helps to synchronize those few lines of code.
        It will take the object as a parameter. It will work the same as Synchronized Method.
        In the case of synchronized method lock accessed is on the method but in the case of
        synchronized block lock accessed is on the object.

        Syntax :
        synchronized (Object){

        }


        - static Synchronization
         - In java, every object has a single lock (monitor) associated with it.
           The thread which is entering into synchronized method or synchronized block will get that lock,
           all other threads which are remaining to use the shared resources have to wait for the completion
           of the first thread and release of the lock.
         - Suppose in the case of where we have more than one object, in this case,
           two separate threads will acquire the locks and enter into a synchronized block or
           synchronized method with a separate lock for each object at the same time. To avoid this,
           we will use static synchronization.
         - In this, we will place synchronized keywords before the static method.
           In static synchronization, lock access is on the class not on object and Method.

           Synxtax:
           synchronized static return_type method_name (Parameters) {//code
           }
           or
           synchronized static return_type method_name (Class_name.class) {
           //code
           }

           If you observe the above results Thread-0, Thread-1 belongs to object-1 and
           Thread-2, Thread-3 are belonging to Object-2. So, there is no interference between thread 0 and 1
           because of the same object (obj1).
           In the same way, there is no interference between Thread 2 and 3 because they belong to the same object (obj2).
           But if you observe there is interference between Thread 0 and 2,
           same as there is interference between Thread 1 and 3.
           To rectify this problem we will use static synchronization.



           After output

           In this static synchronization, we can observe there is no interference between Thread-0 and Thread-2
           same as there is no interference between Thread-1 and 3.
           The next thread is executing after the previous thread completion or releasing lock only.


           -Inter – Thread Communication

           Inter – Thread Communication is communication of two or more threads with each other.
           it can be done by using below methods

           - wait()
           - notify()
           - notifyAll()

          Why we need Inter – Thread Communication?
           - There is a situation on the thread that keeps on checking some conditions repeatedly,
             once that condition satisfies thread moves with the appropriate action.
             This situation is known as polling. This is a wastage of CPU time,
             to reduce the wastage of CPU time due to polling, java uses Inter – Thread Communication Mechanism.
           - wait(), notify(), notifyAll() methods must be called within a synchronized method or block
             otherwise program will compile but when you run it, it will throw illegal monitor State Exception.


          - Wait() method
            It causes the current thread to place itself into the waiting stage until another thread invokes the notify()
            method or notifyAll() method for this object.

          - notify()
            This method wakes up a single thread called wait () on the same object.
            If there is more than one thread that is waiting on this same object,
            then any one of them arbitrarily chosen to be awakened.
            Here awakened thread will not able to proceed until the current thread release lock.
            If any threads are trying to get the lock on this object then the awakened thread will
            also compete with them in the usual manner.

          - notify All()
            Rather than a single thread, it will wake up all the threads waiting on this object monitor.
            The awakened thread will not able to proceed until the current thread releases the lock.
            Again, these awakened threads need to compete with all other threads which are trying to
            get the lock on this object.



         */



    }
}
