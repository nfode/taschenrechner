package de.nickfode.taschenrechner;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TaschenrechnerTest {
    Taschenrechner rechner;

    @Before
    public void setup() {
        rechner = new Taschenrechner();
    }

    @Test
    public void testAdd() {
        assertEquals(5, rechner.add(2, 3));
        assertEquals(2, rechner.add(1, 1));
        assertEquals(-3, rechner.add(-5, 2));
    }

    @Test
    public void testSub() {
        assertEquals(5, rechner.sub(10, 5));
        assertEquals(2, rechner.sub(3, 1));
        assertEquals(-3, rechner.sub(5, 8));
    }

    @Test
    public void testDiv() {
        assertEquals(5, rechner.div(10, 2));
        assertEquals(2, rechner.div(4, 2));
        assertEquals(1, rechner.div(1, 1));
    }

}
