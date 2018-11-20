package com.qualys.interactor;

import com.google.common.collect.Lists;
import com.qualys.PizzaBean;
import com.qualys.entity.Pizza;
import com.qualys.validator.NonVegPizzaNotHavePaneerTopping;
import com.qualys.validator.Validator;
import com.qualys.validator.VegPizzaNotHaveNonVegTopping;
import com.qualys.validator.OneNonVegToppingOnNonVegPizza;

import java.util.ArrayList;

public class PizzaService {

    public Pizza makePizza(PizzaBean pizzaBean){
        return new Pizza.Builder()
                .withPizzaType(pizzaBean.getPizzaType())
                .withPizzaName(pizzaBean.getPizzaName())
                .withCrust(pizzaBean.getCrustType())
                .withToppings(pizzaBean.getTopings())
                .withSize(pizzaBean.getSize())
                .withSides(pizzaBean.getSides())
                .withExtraChees(pizzaBean.isExtraChees())
                .build();
    }


    public void verifyPizaa(Pizza pizza){
        ArrayList<Validator> validators = Lists.newArrayList(new NonVegPizzaNotHavePaneerTopping(),
                new OneNonVegToppingOnNonVegPizza(), new VegPizzaNotHaveNonVegTopping());

        for (Validator e : validators) {
            e.execute(pizza);
        }
    }






}
