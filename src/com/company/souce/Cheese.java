package com.company.souce;

import com.company.BurgerComposition;
import com.company.BurgerCompositionDecorator;

public class Cheese extends BurgerCompositionDecorator {
    private String name=", Cheese";
    private double cost=2.0;
    private double calorie=5.0;
    public Cheese(BurgerComposition newComposition) {
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
