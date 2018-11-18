package com.test.qualys.interactor;

import com.test.qualys.entity.Pizza;
import com.test.qualys.entity.Sides;
import com.test.qualys.entity.Toppings;
import com.test.qualys.offer.LargePizzaOffer;

import static com.test.qualys.datastructure.CollectionData.priceingTable;

public class PricingService {


    public double totalPrice(Pizza pizza){

        double toppingPrice = pizza.getToppings().stream()
                .mapToDouble(Toppings::getValue)
                .sum();
        double sidesPrice = pizza.getSidesList().stream()
                .mapToDouble(Sides::getValue)
                .sum();
        double cheesPrice = pizza.isExtraChees() ? 35.0 : 0;
        Double offerPrice = new LargePizzaOffer().execute(pizza);
        Double pizzaPrice = priceingTable.get(pizza.getPizzaName(), pizza.getSize());

        return pizzaPrice+ toppingPrice+ sidesPrice - offerPrice + cheesPrice;

    }
}
