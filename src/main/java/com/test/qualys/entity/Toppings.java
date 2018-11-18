package com.test.qualys.entity;

import static com.test.qualys.entity.PizzaType.NON_VEG;
import static com.test.qualys.entity.PizzaType.VEG;

public enum Toppings {



    BlackOlive(20, VEG),
    Capsicum(25,VEG),
    Paneer(35,VEG),
    Mushroom(30,VEG),
    FreshTomato(10,VEG),
    ChickenTikka_T(35, NON_VEG),
    BarbequeChicken(45,NON_VEG),
    GrilledChicken(40,NON_VEG);

    Toppings(double value,PizzaType pizzaType) {
        this.value = value;
        this.pizzaType = pizzaType;
    }

    final double value;
    final PizzaType pizzaType;

    public Double getValue() {
        return value;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }
}
