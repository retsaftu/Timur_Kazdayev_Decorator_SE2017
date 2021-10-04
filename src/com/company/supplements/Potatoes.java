package com.company.supplements;

import com.company.BurgerComposition;
import com.company.BurgerCompositionDecorator;

public class Potatoes extends BurgerCompositionDecorator {

    private String name=", Potatoes";
    private double cost=1.0;
    private double calorie=1.0;
    public Potatoes(BurgerComposition newComposition) {
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
