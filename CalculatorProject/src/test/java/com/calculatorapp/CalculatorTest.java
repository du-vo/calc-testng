package com.calculatorapp;

import org.testng.annotations.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("Setting up test class...");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("Tearing down test class...");
    }

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setting up test method...");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Tearing down test method...");
    }

    @Test
    public void testAdd() {
        System.out.println("Testing add method");
        assert calculator.add(2, 3) == 5;
    }

    @Test
    public void testSubtract() {
        System.out.println("Testing subtract method");
        assert calculator.subtract(5, 3) == 2;
    }

    @Test
    public void testMultiply() {
        System.out.println("Testing multiply method");
        assert calculator.multiply(2, 3) == 6;
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivideError() {
        System.out.println("Testing divide method");
        calculator.divide(4, 0);
    }

    @Test
    public void testDivideValid() {
        System.out.println("Testing valid divide method");
        assert calculator.divide(6, 2) == 3;
    }
}
