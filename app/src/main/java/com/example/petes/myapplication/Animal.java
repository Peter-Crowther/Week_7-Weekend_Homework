package com.example.petes.myapplication;

/**
 * Created by petes on 10/11/2017.
 */

public abstract class Animal {

    int cashValue;



    public Animal(int cashValue){
        this.cashValue = cashValue;
    }

    public abstract int cashValue();
}
