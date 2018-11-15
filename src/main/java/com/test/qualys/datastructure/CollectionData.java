package com.test.qualys.datastructure;

import com.google.common.collect.*;
import com.test.qualys.entity.*;

import static com.test.qualys.entity.Crust.*;
import static com.test.qualys.entity.PizzaName.*;
import static com.test.qualys.entity.PizzaName.ChickenTikka;
import static com.test.qualys.entity.PizzaName.PepperBarbecueChicken;
import static com.test.qualys.entity.Sides.*;
import static com.test.qualys.entity.Size.*;
import static com.test.qualys.entity.Toppings.*;

public class CollectionData {
    public static ImmutableBiMap<String, PizzaType> pizzaTypeMap = ImmutableBiMap.of("veg", PizzaType.VEG,
            "nonVeg", PizzaType.NON_VEG);

    public static ImmutableMap<String, PizzaName> pizzaNameMap = ImmutableMap.<String, PizzaName>builder()
            .put("deluxeveggie", DeluxeVeggie)
            .put("cheeseandcorn",CheeseAndCorn)
            .put("paneertikka",PaneerTikka)
            .put("NonVegSupreme",NonVegSupreme)
            .put("chickentikka",ChickenTikka)
            .put("pepperbarbecuechicken",PepperBarbecueChicken)
            .build();

    public static ImmutableMap<String, Crust> crustMap = ImmutableMap.<String,Crust>builder()
            .put("newhandtossed",NewHandTossed)
            .put("wheatthincrust",WheatThinCrust)
            .put("cheeseburst",CheeseBurst)
            .put("freshpanpizza",FreshPanPizza)
            .build();

    public static ImmutableMap<String, Sides> sidesMap = ImmutableMap.<String,Sides>builder()
            .put("colddrink", Colddrink)
            .put("mousseCake", MousseCake)
            .build();


    public static ImmutableMap<String, Toppings> toppingMap = ImmutableMap.<String,Toppings>builder()
            .put("BlackOlive",BlackOlive)
            .put("Capsicum",Capsicum)
            .put("Paneer",Paneer)
            .put("Mushroom",Mushroom)
            .put("FreshTomato",FreshTomato)
            .put("ChickenTikka",ChickenTikka_T)
            .put("BarbequeChicken",BarbequeChicken)
            .put("GrilledChicken",GrilledChicken)
            .build();


    public static ImmutableMap<String, Size> sizegMap = ImmutableMap.<String,Size>builder()
            .put("regular", REGULAR)
            .put("medium", MEDIUM)
            .put("large", LARGE)
            .build();



    public static Table<PizzaName, Size, Double> priceingTable = ImmutableTable.<PizzaName, Size, Double> builder()
            .put(DeluxeVeggie,REGULAR,150.0)
            .put(DeluxeVeggie,MEDIUM,200.0)
            .put(DeluxeVeggie,LARGE,325.0)
            .put(CheeseAndCorn,REGULAR,175.0)
            .put(CheeseAndCorn,MEDIUM,375.0)
            .put(CheeseAndCorn,LARGE,475.0)
            .put(PaneerTikka,REGULAR,160.0)
            .put(PaneerTikka,MEDIUM,290.0)
            .put(PaneerTikka,LARGE,340.0)
            .put(NonVegSupreme,REGULAR,190.0)
            .put(NonVegSupreme,MEDIUM,325.0)
            .put(NonVegSupreme,LARGE,425.0)
            .put(PepperBarbecueChicken,REGULAR,220.0)
            .put(PepperBarbecueChicken,MEDIUM,380.0)
            .put(PepperBarbecueChicken,LARGE,525.0)
            .build();


}
