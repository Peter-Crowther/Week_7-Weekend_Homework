package com.example.petes.myapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by petes on 10/11/2017.
 */

public class ZooTest {

    Lion lion;
    Snake snake;
    Zoo enclosures;
    Enclosure lionEnclosure;
    Enclosure snakeEnclosure;

    @Before
    public void before() {
        lion = new Lion(1500, "Junglelion");
        enclosures = new Zoo<>();
        lionEnclosure = new Enclosure<>();
        snakeEnclosure = new Enclosure<>();
    }



    @Test
    public void testEnclosuresStartsEmpty() {
        int actual = enclosures.getNumberOfEnclosures();
        assertEquals(0, actual);
    }

    @Test
    public void testAddToEnclosures() {
        enclosures.addEnclosure(lionEnclosure);
        enclosures.addEnclosure(snakeEnclosure);
        int actual = enclosures.getNumberOfEnclosures();
        assertEquals(2, actual);
    }

    @Test
    public void testRemoveFromEnclosure() {
        enclosures.addEnclosure(lionEnclosure);
        enclosures.addEnclosure(snakeEnclosure);
        enclosures.removeEnclosure(snakeEnclosure);
        int actual = enclosures.getNumberOfEnclosures();
        assertEquals(1, actual);
    }

}
