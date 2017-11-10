package com.example.petes.myapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by petes on 10/11/2017.
 */

public class AnimalsTest {

    Lion lion;
    Snake snake;

    @Before
    public void before(){
        lion = new Lion(1500, "JungleLion");
        snake = new Snake(200, "Cobra");
    }

    @Test
    public void testHasSpecies() {
        assertEquals("JungleLion", lion.getSpecies());
        assertEquals("Cobra", snake.getSpecies());
    }

    @Test
    public void testHasValue() {
        assertEquals(1500, lion.cashValue());
    }
}
