package com.test;

import org.junit.*;

/**
 * Created by PriyabratP on 11-07-2017.
 */
public class TestAnnotations {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass");
    }

    @Before
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @After
    public void afterTest(){
        System.out.println("afterTest");
    }
}
