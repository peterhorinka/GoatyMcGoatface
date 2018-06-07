package com.codecool.goats;

import java.util.List;
import java.util.Random;

public abstract class Goat {
    Random random = new Random();
    Gender gender;
    Attributes attributes;
    boolean free;
    boolean asleep;
    int health;


    public Goat() {
        gender = Gender.values()[random.nextInt(Gender.values().length)];
        if (gender.equals(Gender.female)){
        attributes.hornSize = 2;
        GoatFarm.females.add(this);
    } else {
            attributes.hornSize = 2 + random.nextInt(8) +1;
        }
    attributes.intelligence = random.nextInt(10) +1;
    attributes.agility = random.nextInt(10)+1;
    GoatFarm.males.add(this);
    }

    void muiltiply(){}
}
