package com.codecool.goats;

public class Attribute {

    private AttributeType type;
    private int min, max;
    private int value;

    public Attribute(AttributeType type, int min, int max, int value) {
        this.type = type;
        this.min = min;
        this.max = max;
        this.value = value;
    }

    public Attribute(AttributeType type, int min, int max) {
        this(type, min, max, type.getDefaultValue());
    }

    public Attribute(AttributeType type) {
        this(type, type.getDefaultMin(), type.getDefaultMax(), type.getDefaultValue());
    }

    public AttributeType getType() {
        return type;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public Attribute setValue(int value) {
        if (value < min) value = min;
        else if (value > max) value = max;
        else this.value = value;
        return this;
    }

    public Attribute setMin(int min) {
        this.min = min;
        return this;
    }

    public Attribute setMax(int max){
        this.max = max;
        return this;
    }

    public void increaseBy(int by){
        setValue(value + by);
    }

    public void decreaseBy(int by){
        setValue(value - by);
    }

    public int getValue() {
        return value;
    }

    public Attribute randomizeBetween(int min, int max){
        setValue(Util.randomBetween(min, max));
        return this;
    }
}