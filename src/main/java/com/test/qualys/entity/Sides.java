package com.test.qualys.entity;

public enum Sides {

    Colddrink(55),
    MousseCake(90);

    Sides(double value) {
        this.value = value;
    }

    double value;

    public double getValue() {
        return value;
    }
}
