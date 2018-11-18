package com.test.qualys.offer;

import com.test.qualys.entity.Pizza;
import com.test.qualys.entity.Size;
import com.test.qualys.entity.Toppings;

public class LargePizzaOffer implements Offer{

    @Override
    public Double execute(Pizza pizza) {
        double sum = 0;
        if (pizza.getSize().equals(Size.LARGE)){
            for (Toppings toppings:pizza.getToppings()){
                sum = sum + toppings.getValue();

            }


        }

        return sum;
    }
}
