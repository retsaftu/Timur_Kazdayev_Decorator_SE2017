package com.company.cheese;

import com.company.BurgerComposition;
import com.company.BurgerCompositionDecorator;

public class Roquefort extends BurgerCompositionDecorator {
    private String name=", Roquefort";
    private double cost=6.6;
    private double calorie=4.6;
    public Roquefort(BurgerComposition newComposition) {
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
