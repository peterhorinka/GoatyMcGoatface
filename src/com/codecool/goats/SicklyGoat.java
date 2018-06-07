package com.codecool.goats;

import static com.codecool.goats.AttributeType.HEALTH;

public class SicklyGoat extends Victim{

    public SicklyGoat() {
        attr(HEALTH).setValue(30);
    }
}
