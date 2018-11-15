package com.test.qualys.interactor;

import com.google.common.collect.Lists;
import com.test.qualys.PizzaBean;
import com.test.qualys.entity.Pizza;
import com.test.qualys.validator.NonVegPizzaNotHavePaneerTopping;
import com.test.qualys.validator.OneNonVegToppingOnNonVegPizza;
import com.test.qualys.validator.Validator;
import com.test.qualys.validator.VegPizzaNotHaveNonVegTopping;

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
