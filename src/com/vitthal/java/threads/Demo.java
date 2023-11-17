package com.vitthal.java.threads;

public class Demo {
    /*

    Before introducing the thread concept we were unable to run more than one task in parallel
    it was drawback, and to remove that drawback, Thread CConcept was introduced

    A thread is a very light weighted process or we can say the smallest part of process that allows a program
    to operate more efficiently by running multiple tasks simultaneously

    In order to perform complicated tasks in the background, we used the thread concept in java
    all the tasks are executed w/o affecting the main program

    in a program pr process all the threads have their own separate path for execution so each thread of process
    is independent

    Another benifit of using thread is that if a thread gets an excception or an error at the time of execution,
    It dosent affect the execution on other thread
    All the the threads share a common memory and have their own stack, loacl variables and program counter.

    when the multiple threds are executed in parallel at the same time this process known as Multithreading

    in SImple way thread is :
    1. Feature through which we can perform the multiple activities within single process
    2. Lightwight process
    3. Series of executed statements
    4. Nested sequence of method class

    Thread Model :

    Just like process a thread exsists in several states

                 States
    New -> Runnable  -> Running -> Terminated

    1. New - (Ready to run)
        A thread is in New when it gets CPU time
    2. Running
        A thread is in running state when it is under execution
    3. Suspended
        A thread is in the suspended state when it is temporatily or under execution
    4. Blocked
        A thread is in blocked state when it is waiting for resources
    5. Terminated
        A thread comes in this state when at any given time, it halts its execution immediately.


       - Creating Thread

       A thread is created either by "creating or implementing" the Runnable Interface or by extending the Thread class.
       These are the only two ways through which we can create a thread.

       -Thread Class
       it has several methods and constructors which allow us to perform various operation on a thread
       The Thread class extends the Object class. and object class implements the Runnable interface
       The thread cass has the following constructors

       -Thread()
       -Thread(Runnable, String name)
       -Thread(Runnable target)
       -Thread(ThreadGroup group, Runnable target, String name)
       -Thread(ThreadGroup group, Runnable target)
       -Thread(ThreadGroup group, String name)
       -Thread(ThreadGroup group, Runnable target, String name, long stackSize)

       Runnable Interface

       The Runnable interface is required to be implemented by that class whose instances are intended to be executed by a thread.
       The runnable interface gives us the run() method to perform an action for the thread.


       - start() method
       The method is used for starting a thread that we have newly created.
        It starts a new thread with a new callstack. After executing the start() method,
        the thread changes the state from New to Runnable.
        It executes the run() method when the thread gets the correct time to execute it.



     */
    public static void main(String[] args) {
        // creating instance of class which extends Thread class
        ThreadExample1 t1 = new ThreadExample1();

        // call the thread then we need to call the start()
        t1.start();


        ThreadExample2 t2 = new ThreadExample2("Amruta");


    }



}
