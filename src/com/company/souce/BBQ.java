package com.company.souce;

import com.company.BurgerComposition;
import com.company.BurgerCompositionDecorator;

public class BBQ extends BurgerCompositionDecorator {
    private String name=", BBQ";
    private double cost=1.0;
    private double calorie=1.2;
    public BBQ(BurgerComposition newComposition) {
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
