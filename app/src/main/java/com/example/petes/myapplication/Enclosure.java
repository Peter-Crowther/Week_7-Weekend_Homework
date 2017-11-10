package com.example.petes.myapplication;

import java.util.ArrayList;

/**
 * Created by petes on 10/11/2017.
 */

public class Enclosure<E extends Animal> {
    ArrayList<E> enclosure;

    public Enclosure() {
         this.enclosure = new ArrayList<>();
    }

    public void add(E animal) {
        this.enclosure.add(animal);
    }

    public void remove(E animal) {
        this.enclosure.remove(animal);
    }

    public int getNumberOfAnimals() {
        return this.enclosure.size();
    }


}
