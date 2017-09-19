package com.basics;

/**
 * Created by PriyabratP on 03-08-2017.
 */
public class Thread2 implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread2 Execution Done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
