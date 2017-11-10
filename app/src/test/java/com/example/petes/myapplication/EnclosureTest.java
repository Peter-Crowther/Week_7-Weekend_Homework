package com.example.petes.myapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by petes on 10/11/2017.
 */

public class EnclosureTest {

    Lion lion;
    Snake snake;


    @Test
    public void testEnclosureIsEmpty() {
        Enclosure enclosure = new Enclosure<>();
        int actual = enclosure.getNumberOfAnimals();
        assertEquals(0, actual);
    }

    @Test
    public void testAdd() {
        lion = new Lion(500, "Junglelion");
        Enclosure enclosure = new Enclosure<>();
        enclosure.add(lion);
        int actual = enclosure.getNumberOfAnimals();
        assertEquals(1, actual);
    }

    @Test
    public void testRemove() {
        lion = new Lion(500, "Junglelion");
        snake = new Snake(200, "Cobra");
        Enclosure enclosure = new Enclosure<>();
        enclosure.add(lion);
        enclosure.add(snake);
        enclosure.remove(snake);
        int actual = enclosure.getNumberOfAnimals();
        assertEquals(1, actual);
    }





}
