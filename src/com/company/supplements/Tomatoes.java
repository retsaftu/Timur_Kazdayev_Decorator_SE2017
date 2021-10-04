package com.company.supplements;

import com.company.BurgerComposition;
import com.company.BurgerCompositionDecorator;

public class Tomatoes extends BurgerCompositionDecorator {
    private String name=", Tomatoes";
    private double cost=5.0;
    private double calorie=0.5;
    public Tomatoes(BurgerComposition newComposition) {
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
