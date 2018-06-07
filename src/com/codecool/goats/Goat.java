package com.codecool.goats;

import java.util.Map;

import static com.codecool.goats.AttributeType.*;
import static com.codecool.goats.Gender.*;
import static com.codecool.goats.Util.random;

public abstract class Goat {
    static int nextId;
    int id;
    Gender gender;
    Map<AttributeType, Attribute> attributes;
    boolean free;
    boolean asleep;


    public Goat() {
        addAttribute(new Attribute(HEALTH));
        addAttribute(new Attribute(AGILITY));
        addAttribute(new Attribute(INTELLIGENCE));
        addAttribute(new Attribute(HORNSIZE));
        addAttribute(new Attribute(DEFENSE));
        gender = Gender.values()[random.nextInt(Gender.values().length)];
        if (gender.equals(female)){
            attr(HORNSIZE).setValue(2);
            GoatFarm.females.add(this);
        } else {
            attr(HORNSIZE).randomizeBetween(3, 10);
            GoatFarm.males.add(this);
        }
        attr(INTELLIGENCE).randomizeBetween(1, 10);
        attr(AGILITY).randomizeBetween(3, 6);
        System.out.println("goat created: " + this.toString());
    }

    public Attribute attr(AttributeType type){
        return attributes.get(type);
    }

    void addAttribute(Attribute attribute){
        attributes.put(attribute.getType(), attribute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(id);
        sb.append('(');
        for (Map.Entry<AttributeType, Attribute> attr : attributes.entrySet()) {
            sb.append(attr.getKey());
            sb.append(": ");
            sb.append(attr.getValue());
            sb.append(", ");
        }
        sb.setCharAt(sb.length()-1, ')');
        return sb.toString();
    }

    void multiply(){}

    void receiveHit(int damage, CanAttack from){
        attr(HEALTH).decreaseBy(damage - attr(DEFENSE).getValue());
        if (attr(HEALTH).getValue() <= 0){
            //dead
            GoatFarm.victims.remove(this);
        }

    }
}
