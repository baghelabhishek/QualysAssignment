package com.test.qualys.interactor;

import com.test.qualys.datastructure.CollectionData;
import com.test.qualys.entity.Pizza;
import com.test.qualys.offer.LargePizzaOffer;

import static com.test.qualys.datastructure.CollectionData.*;

public class PricingService {


    public double totalPrice(Pizza pizza){

        double toppingPrice = pizza.getToppings().stream()
                .mapToDouble(e-> e.getValue())
                .sum();
        double sidesPrice = pizza.getSidesList().stream()
                .mapToDouble(e -> e.getValue())
                .sum();
        Double offerPrice = new LargePizzaOffer().execute(pizza);
        Double pizzaPrice = priceingTable.get(pizza.getPizzaName(), pizza.getSize());

        return pizzaPrice+ toppingPrice+ sidesPrice - offerPrice;

    }
}
