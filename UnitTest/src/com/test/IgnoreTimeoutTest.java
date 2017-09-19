package com.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by PriyabratP on 11-07-2017.
 */
public class IgnoreTimeoutTest {

    @Test
    public void test1(){
        Assert.assertEquals(1,1);
    }

    @Ignore
    @Test
    public void test2(){
        Assert.assertEquals(1.1,1.,0);
    }

    @Test(timeout = 1000)
    public void timeOutTest(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
