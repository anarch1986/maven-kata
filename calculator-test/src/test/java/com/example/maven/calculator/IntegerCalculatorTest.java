package com.example.maven.calculator;
import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;

public class IntegerCalculatorTest {

    private static IntegerCalculator calculator;

    @BeforeClass
    public static void setup() {
        //TODO instantiate your calculator
        // calculator = new MyIntCalculator();
    }

    @Test
    public void shouldAddTwoNumbers() {
        assertEquals(5,
                calculator.sum(2, 3));
    }
    
    @Test
    public void shouldSubtractTwoNumbers() {
        assertEquals(-1,
                calculator.difference(2, 3));
    }

    
    @Test
    public void shouldMultiplyTwoNumbers() {
        assertEquals(24,
                calculator.product(6, 4));
    }


}
