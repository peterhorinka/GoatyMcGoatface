package com.codecool.goats;

import static com.codecool.goats.AttributeType.HEALTH;

public abstract class Predator extends Goat implements CanAttack{

    public Predator() {
        GoatFarm.predators.add(this);
        attr(HEALTH).setValue(50);
    }

    abstract void attack();
}
