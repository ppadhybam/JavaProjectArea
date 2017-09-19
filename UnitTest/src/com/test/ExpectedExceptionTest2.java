package com.test;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by PriyabratP on 11-07-2017.
 */
public class ExpectedExceptionTest2 {


    @Test
    public void testArithmeticException(){
        try {
            int i = 10/0;
            Assert.fail();
        }catch (ArithmeticException e){
            Assert.assertThat(e.getMessage(),is("/ by zero"));
        }
    }

    @Test
    public void testNumberFormatException(){
        try {
            int i = Integer.parseInt("pp");
            Assert.fail();
        }catch (NumberFormatException e){
            Assert.assertThat(e.getMessage(),is("For input string: \"pp\""));
        }
    }
}
