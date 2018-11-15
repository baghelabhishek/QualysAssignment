package com.test.qualys.validator;

import com.test.qualys.entity.Toppings;
import com.test.qualys.entity.Pizza;
import com.test.qualys.entity.PizzaType;

import static com.test.qualys.entity.PizzaType.*;

public class VegPizzaNotHaveNonVegTopping implements Validator {

    public void execute(Pizza pizza) {
        if (pizza.getPizzaType().equals(VEG)){

            for (Toppings toppings:pizza.getToppings()){
                if (toppings.getPizzaType().equals(PizzaType.NON_VEG)){
                    throw new RuntimeException("Vegetarian pizza cannot have a non-vegetarian topping.");
                }
            }

        }

    }
}
