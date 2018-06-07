package com.codecool.goats;

public enum AttributeType {
    HEALTH(0, 100), INTELLIGENCE(0, 100), AGILITY(0, 100), HORNSIZE(0, 10), DAMAGE(0, 100), DEFENSE(0, 100);

    AttributeType(int defaultMin, int defaultMax) {
        this.defaultMin = defaultMin;
        this.defaultMax = defaultMax;
    }

    private int defaultMin, defaultMax;

    public int getDefaultMin() {
        return defaultMin;
    }

    public int getDefaultMax() {
        return defaultMax;
    }

    public int getDefaultValue(){
        return Math.round((defaultMax + defaultMin)/2);
    }
}
