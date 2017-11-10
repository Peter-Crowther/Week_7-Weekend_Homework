package com.example.petes.myapplication;

import java.util.ArrayList;

/**
 * Created by petes on 10/11/2017.
 */

public class Zoo<E> {

    private ArrayList<E> enclosures;

    public Zoo() {
    this.enclosures = new ArrayList<>();
    }

    public void addEnclosure(E animalEnclosure) {
        this.enclosures.add(animalEnclosure);
    }

    public void removeEnclosure(E animalEnclosure) {
        this.enclosures.remove(animalEnclosure);
    }


    public int getNumberOfEnclosures() {
        return this.enclosures.size();
    }
}
