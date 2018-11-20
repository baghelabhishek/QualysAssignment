package com.qualys.validator;

import com.qualys.entity.Pizza;
import com.qualys.entity.PizzaType;
import com.qualys.entity.Toppings;

public class VegPizzaNotHaveNonVegTopping implements Validator {

    public void execute(Pizza pizza) {
        if (pizza.getPizzaType().equals(PizzaType.VEG)){

            for (Toppings toppings:pizza.getToppings()){
                if (toppings.getPizzaType().equals(PizzaType.NON_VEG)){
                    throw new RuntimeException("Vegetarian pizza cannot have a non-vegetarian topping.");
                }
            }

        }

    }
}
