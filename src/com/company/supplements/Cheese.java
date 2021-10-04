package com.company.supplements;

import com.company.BurgerComposition;
import com.company.BurgerCompositionDecorator;

public class Cheese extends BurgerCompositionDecorator {
    private String name=", Cheese";
    private double cost=6.6;
    private double calorie=7.7;
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
