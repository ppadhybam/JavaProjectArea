package com.basics;

/**
 * Created by PriyabratP on 03-08-2017.
 */
public class Thread1 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(1000);
            System.out.println("Thread1 Execution Done");
            System.out.println(currentThread());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
