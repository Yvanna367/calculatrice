package com.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatriceTest {

    Calculatrice calc = new Calculatrice();

    @Test
    public void testAddition() {
        assertEquals(5, calc.additionner(2, 3));
    }

    @Test
    public void testSoustraction() {
        assertEquals(2, calc.soustraire(5, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calc.multiplier(2, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(4, calc.diviser(8, 2));
    }
}