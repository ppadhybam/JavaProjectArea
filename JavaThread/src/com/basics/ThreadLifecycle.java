package com.basics;

/**
 * Created by PriyabratP on 04-08-2017.
 */
public class ThreadLifecycle {

    public static void main(String [] args){
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();
    }
}

class ThreadClass implements Runnable {

    public ThreadClass(){
        System.out.println("Creating Thread");
    }

    @Override
    public void run() {

        System.out.println("Running");

    }

    public void start(){
        System.out.println("Thread starting");
        Thread th = new Thread(this);
    }
}
