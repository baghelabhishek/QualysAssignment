package com.qualys.offer;

import com.qualys.entity.Pizza;
import com.qualys.entity.Size;
import com.qualys.entity.Toppings;

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
