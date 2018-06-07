package com.codecool.goats;

import static com.codecool.goats.AttributeType.DAMAGE;

public class PrimalGoat extends Predator{
    public PrimalGoat() {
        addAttribute(new Attribute(DAMAGE));
        attr(DAMAGE).setValue(100);
    }

    @Override
    void attack() {
        //Primal can attack directly, avoiding any defenders
        Victim victim = GoatFarm.victims.get(Util.randomBetween(0, GoatFarm.victims.size()));
        attack(victim);
    }

    @Override
    public void attack(Goat victim) {
        victim.receiveHit(attr(DAMAGE).getValue(), this);
    }
}
