package com.test.qualys.datastructure;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.test.qualys.entity.*;

import static com.test.qualys.entity.Crust.*;
import static com.test.qualys.entity.PizzaName.*;
import static com.test.qualys.entity.Sides.Colddrink;
import static com.test.qualys.entity.Sides.MousseCake;
import static com.test.qualys.entity.Toppings.*;

public class CollectionData {

    private static final String VEG = "veg";
    private static final String REGULAR = "regular";
    private static final String MEDIUM = "medium";
    private static final String LARGE = "large";

    private static final String DELUXE_VEGGIE = "deluxeveggie";
    private static final String CHEESE_AND_CORN = "cheeseandcorn";
    private static final String PANEER_TIKKA = "paneertikka";
    private static final String NON_VEG_SUPREME = "NonVegSupreme";
    private static final String CHICKEN_TIKKA = "chickentikka";
    private static final String PEPPER_BARBECUE_CHICKEN = "pepperbarbecuechicken";

    private static final String BLACK_OLIVE = "BlackOlive";
    private static final String CAPSICUM = "Capsicum";
    private static final String PANEER = "Paneer";
    private static final String MUSHROOM = "Mushroom";
    private static final String FRESH_TOMATO = "FreshTomato";
    private static final String CHICKEN_TIKKA1 = "ChickenTikka";
    private static final String BARBEQUE_CHICKEN = "BarbequeChicken";
    private static final String GRILLED_CHICKEN = "GrilledChicken";
    private static final String NON_VEG = "nonVeg";
    private static final String NEW_HAND_TOSSED = "newhandtossed";
    private static final String WHEAT_THIN_CRUST = "wheatthincrust";
    private static final String CHEESE_BURST = "cheeseburst";
    private static final String FRESH_PAN_PIZZA = "freshpanpizza";
    private static final String COLD_DRINK = "colddrink";
    private static final String MOUSSE_CAKE = "mousseCake";

    public static final ImmutableBiMap<String, PizzaType> pizzaTypeMap = ImmutableBiMap.of(VEG, PizzaType.VEG,
            NON_VEG, PizzaType.NON_VEG);

    public static final ImmutableMap<String, PizzaName> pizzaNameMap = ImmutableMap.<String, PizzaName>builder()
            .put(DELUXE_VEGGIE, DeluxeVeggie)
            .put(CHEESE_AND_CORN,CheeseAndCorn)
            .put(PANEER_TIKKA,PaneerTikka)
            .put(NON_VEG_SUPREME,NonVegSupreme)
            .put(CHICKEN_TIKKA,ChickenTikka)
            .put(PEPPER_BARBECUE_CHICKEN,PepperBarbecueChicken)
            .build();

    public static final ImmutableMap<String, Crust> crustMap = ImmutableMap.<String,Crust>builder()
            .put(NEW_HAND_TOSSED,NewHandTossed)
            .put(WHEAT_THIN_CRUST,WheatThinCrust)
            .put(CHEESE_BURST,CheeseBurst)
            .put(FRESH_PAN_PIZZA,FreshPanPizza)
            .build();

    public static final ImmutableMap<String, Sides> sidesMap = ImmutableMap.<String,Sides>builder()
            .put(COLD_DRINK, Colddrink)
            .put(MOUSSE_CAKE, MousseCake)
            .build();
    public static final ImmutableMap<String, Toppings> toppingMap = ImmutableMap.<String,Toppings>builder()
            .put(BLACK_OLIVE,BlackOlive)
            .put(CAPSICUM,Capsicum)
            .put(PANEER,Paneer)
            .put(MUSHROOM,Mushroom)
            .put(FRESH_TOMATO,FreshTomato)
            .put(CHICKEN_TIKKA1,ChickenTikka_T)
            .put(BARBEQUE_CHICKEN,BarbequeChicken)
            .put(GRILLED_CHICKEN,GrilledChicken)
            .build();


    public static final ImmutableMap<String, Size> sizegMap = ImmutableMap.<String,Size>builder()
            .put(REGULAR, Size.REGULAR)
            .put(MEDIUM, Size.MEDIUM)
            .put(LARGE, Size.LARGE)
            .build();



    public static final Table<PizzaName, Size, Double> priceingTable = ImmutableTable.<PizzaName, Size, Double> builder()
            .put(DeluxeVeggie, Size.REGULAR,150.0)
            .put(DeluxeVeggie, Size.MEDIUM,200.0)
            .put(DeluxeVeggie, Size.LARGE,325.0)
            .put(CheeseAndCorn, Size.REGULAR,175.0)
            .put(CheeseAndCorn, Size.MEDIUM,375.0)
            .put(CheeseAndCorn, Size.LARGE,475.0)
            .put(PaneerTikka, Size.REGULAR,160.0)
            .put(PaneerTikka, Size.MEDIUM,290.0)
            .put(PaneerTikka, Size.LARGE,340.0)
            .put(NonVegSupreme, Size.REGULAR,190.0)
            .put(NonVegSupreme, Size.MEDIUM,325.0)
            .put(NonVegSupreme, Size.LARGE,425.0)
            .put(PepperBarbecueChicken, Size.REGULAR,220.0)
            .put(PepperBarbecueChicken, Size.MEDIUM,380.0)
            .put(PepperBarbecueChicken, Size.LARGE,525.0)
            .build();


}
