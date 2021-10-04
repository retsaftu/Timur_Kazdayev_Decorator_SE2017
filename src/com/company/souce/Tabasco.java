package com.company.souce;

import com.company.BurgerComposition;
import com.company.BurgerCompositionDecorator;

public class Tabasco extends BurgerCompositionDecorator {
    private String name=", Tabasco";
    private double cost=2.0;
    private double calorie=2.0;
    public Tabasco(BurgerComposition newComposition) {
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
