package com.company.cheese;

import com.company.BurgerComposition;
import com.company.BurgerCompositionDecorator;

public class DutchCheese extends BurgerCompositionDecorator {
    private String name=", DutchCheese";
    private double cost=1.1;
    private double calorie=1.1;
    public DutchCheese(BurgerComposition newComposition) {
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
