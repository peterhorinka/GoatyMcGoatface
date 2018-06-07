package com.codecool.goats;

public abstract class Victim extends Goat{
    DefenderGoat protector = null;


    public Victim() {
        GoatFarm.victims.add(this);
    }

    public void setProtector(DefenderGoat protector) {
        this.protector = protector;
    }
}
