package com.qualys.validator;

import com.qualys.entity.Pizza;
import com.qualys.entity.PizzaType;
import com.qualys.entity.Toppings;

public class NonVegPizzaNotHavePaneerTopping implements Validator{

    public void execute(Pizza pizza) {
        if (pizza.getPizzaType().equals(PizzaType.NON_VEG)){

            for (Toppings toppings:pizza.getToppings()){
                if (toppings.equals(Toppings.Paneer)){
                    throw new RuntimeException("Non-vegetarian pizza cannot have paneer topping.");
                }
            }
        }
    }
}
