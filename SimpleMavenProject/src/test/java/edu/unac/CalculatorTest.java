package edu.unac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(3, 2));
    }

    @Test
    void testDivision(){
        Calculator calc = new Calculator();
        assertEquals(2, calc.division(6, 3));

    }

    @Test
    void testmultiply(){
        Calculator calc = new Calculator();
        assertEquals(25, calc.multiply(5, 5));

    }

    @Test
    void subtract(){
        Calculator calc = new Calculator();
        assertEquals(6, calc.subtract(8, 2));
    }





}



