package com.company.meat;

import com.company.BurgerComposition;
import com.company.BurgerCompositionDecorator;

public class MarbledBeefCutlet extends BurgerCompositionDecorator {
    private String name=", MarbledBeefCutlet";
    private double cost=199.9;
    private double calorie=50.6;
    public MarbledBeefCutlet(BurgerComposition newComposition) {
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
