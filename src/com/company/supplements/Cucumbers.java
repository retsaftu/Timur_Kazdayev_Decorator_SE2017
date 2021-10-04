package com.company.supplements;

import com.company.BurgerComposition;
import com.company.BurgerCompositionDecorator;

public class Cucumbers extends BurgerCompositionDecorator {
    private String name=", Cucumbers";
    private double cost=7.7;
    private double calorie=8.8;
    public Cucumbers(BurgerComposition newComposition) {
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
