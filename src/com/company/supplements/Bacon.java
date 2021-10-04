package com.company.supplements;

import com.company.BurgerComposition;
import com.company.BurgerCompositionDecorator;

public class Bacon extends BurgerCompositionDecorator {
    private String name=", Bacon";
    private double cost=32.3;
    private double calorie=32.4;
    public Bacon(BurgerComposition newComposition) {
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
