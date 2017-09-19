package com.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by PriyabratP on 11-07-2017.
 */
public class GlobalTimeOutTest {

    @Rule
    public Timeout timeout = Timeout.seconds(1); // Must be public else won't work

    @Test
    public void test1(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
