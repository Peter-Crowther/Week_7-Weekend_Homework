package com.example.petes.myapplication;

/**
 * Created by petes on 10/11/2017.
 */

public class Snake extends Animal {

    String species;

    public Snake(int cashValue, String species) {
        super(cashValue);
        this.species = species;
    }

    @Override
    public int cashValue() {
        return this.cashValue;
    }

    public String getSpecies() {
        return this.species;
    }
}
