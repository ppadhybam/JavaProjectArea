package com.basics;

/**
 * Created by PriyabratP on 03-08-2017.
 */
public class MainClass {

    public static void main(String [] args){

        Thread1 th1 = new Thread1();
        th1.setName("Thread1");
        th1.start();
        System.out.println(th1.getName());

        Thread2 thRunnable = new Thread2();
        Thread th2 = new Thread(thRunnable);
        th2.setName("Thread2");
        th2.start();
        System.out.println(th2.getName());
    }
}
