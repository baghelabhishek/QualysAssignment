package com.qualys;

import com.google.common.collect.Lists;
import com.qualys.entity.*;
import com.qualys.interactor.PizzaServiceTest;
import org.junit.Test;

import java.util.ArrayList;

import static com.qualys.entity.Crust.WheatThinCrust;
import static com.qualys.entity.PizzaName.ChickenTikka;
import static com.qualys.entity.Sides.Colddrink;
import static com.qualys.entity.Toppings.Paneer;

public class InventoryTest {

    private final Inventory inventory = new Inventory();

    @Test
    public void shouldNotThrowExceptionWhenAllIngredientAvailable() {
        ArrayList<Toppings> toppings = Lists.newArrayList(Paneer);
        ArrayList<Sides> sides = Lists.newArrayList(Colddrink);
        Pizza pizza = new PizzaServiceTest().buildPizza(PizzaType.VEG, ChickenTikka, Size.MEDIUM,
                WheatThinCrust, toppings,sides,false);

        inventory.checkAvailability(pizza);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenSidesAreNotAvailable() {
        ArrayList<Toppings> toppings = Lists.newArrayList(Paneer);
        ArrayList<Sides> sides = Lists.newArrayList(Colddrink,Colddrink,Colddrink,Colddrink,Colddrink,Colddrink,Colddrink
        ,Colddrink,Colddrink,Colddrink,Colddrink);
        Pizza pizza = new PizzaServiceTest().buildPizza(PizzaType.VEG, ChickenTikka, Size.MEDIUM,
                WheatThinCrust, toppings,sides,false);

        inventory.checkAvailability(pizza);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenToppingIsUnAvailable() {
        ArrayList<Toppings> toppings = Lists.newArrayList(Paneer,Paneer,Paneer);
        ArrayList<Sides> sides = Lists.newArrayList(Colddrink);
        Pizza pizza = new PizzaServiceTest().buildPizza(PizzaType.VEG, ChickenTikka, Size.MEDIUM,
                WheatThinCrust, toppings,sides,false);

        inventory.checkAvailability(pizza);
    }
    
    @Test
    public void userShouldBeAbleToAddCasicumToInventory() {

        int beforeAdding = inventory.getCapsicum().get();
        inventory.setCapsicum(4);

        Assert.assertThat(inventory.getCapsicum().get(), Matchers.is(beforeAdding+ 4));

    }
}
