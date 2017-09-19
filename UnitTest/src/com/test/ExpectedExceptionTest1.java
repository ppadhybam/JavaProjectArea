package com.test;

import org.junit.Test;

/**
 * Created by PriyabratP on 11-07-2017.
 */
public class ExpectedExceptionTest1 {

    @Test(expected = ArithmeticException.class)
    public void testArithmeticException(){
        int i = 12/0;
    }

    @Test(expected = NumberFormatException.class)
    public void numberFormatException(){
        int i = Integer.parseInt("Hello");
    }
}
