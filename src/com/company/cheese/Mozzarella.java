package com.company.cheese;

import com.company.BurgerComposition;
import com.company.BurgerCompositionDecorator;

public class Mozzarella extends BurgerCompositionDecorator {
    private String name=", Mozzarella";
    private double cost=2.0;
    private double calorie=5.3;
    public Mozzarella(BurgerComposition newComposition) {
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
