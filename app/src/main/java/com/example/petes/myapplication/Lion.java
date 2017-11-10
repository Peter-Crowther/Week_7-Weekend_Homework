package com.example.petes.myapplication;

import java.util.ArrayList;

/**
 * Created by petes on 10/11/2017.
 */

public class Lion extends Animal  {
    String species;


    public Lion(int cashValue, String species) {
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
