package com.company.meat;

import com.company.BurgerComposition;
import com.company.BurgerCompositionDecorator;

public class BeefCutlet extends BurgerCompositionDecorator {
    private String name=", BeefCutlet";
    private double cost=19.9;
    private double calorie=23.5;
    public BeefCutlet(BurgerComposition newComposition) {
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
