package org.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestingD
{
    @Test
    public void test9()
    {
        System.out.println("testing the Test9 and executed");
    }
    @BeforeClass
    public void test10()
    {
        System.out.println("testing the Test10 and executed");
    }
    @AfterClass
    public void test11()
    {
        System.out.println("testing the Test11 and executed");
    }
    @Test
    public void test12() {
        System.out.println("testing the Test12 and executed");
    }
}
