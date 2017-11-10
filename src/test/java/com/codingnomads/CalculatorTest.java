package com.codingnomads;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {


    Calculator c = new Calculator();

    @Test
    public void add() throws Exception {
        assertEquals(4.0, c.add(2,2),0);
        //assertEquals(4, c.add(2,2));
       // assertEquals(8, c.add(4,4));
       // assertNotEquals(7, c.add(3, 65));

    }

    @Test
    public void subtract() throws Exception {
        assertEquals(2, c.subtract(6,4),0);

    }

    @Test
    public void mult() throws Exception {

        assertEquals(100.0, c.mult(25,4),0);
    }

    @Test
    public void divide() throws Exception {
        // assertEquals(4, 8,2);
            //assertNotEquals(0, c.divide(0,6));
//        assertNotEquals(0, 6, 0);
    }

}