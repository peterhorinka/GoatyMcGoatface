package com.codecool.goats;

public abstract class Predator extends Goat{

    public Predator() {
        GoatFarm.predators.add(this);
        health = 50;
    }
}
