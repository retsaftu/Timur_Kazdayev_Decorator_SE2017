package com.company.meat;

import com.company.BurgerComposition;
import com.company.BurgerCompositionDecorator;

public class ChickenCutlet extends BurgerCompositionDecorator {
    private String name=", ChickenCutlet";
    private double cost=15.5;
    private double calorie=10.3;
    public ChickenCutlet(BurgerComposition newComposition) {
        super(newComposition);
    }
    public String getName(){
        return this.burgerComposition.getName()+name;
    }
    public double getCalorieContent(){
        return this.burgerComposition.getCalorieContent()+calorie;
    }
    public double getCost(){
        return this.burgerComposition.getPrice()+cost;
    }
}
