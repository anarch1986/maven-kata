package com.example.maven.calculator;
import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;

public class DoubleCalculatorTest {

    private static DoubleCalculator calculator;
    final private static double delta = 0.0001;

    @BeforeClass
    public static void setup() {
        calculator = new MyDoubleCalculator();
    }

    @Test
    public void shouldAddTwoNumbers() {
        assertEquals(5,
                calculator.sum(2, 3), delta);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        assertEquals(-1,
                calculator.difference(2, 3), delta);
    }


    @Test
    public void shouldMultiplyTwoNumbers() {
        assertEquals(24,
                calculator.product(6, 4), delta);
    }

}
