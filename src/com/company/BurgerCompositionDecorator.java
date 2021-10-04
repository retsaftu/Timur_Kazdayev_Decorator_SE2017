package com.company;

public abstract class BurgerCompositionDecorator implements BurgerComposition{

    protected BurgerComposition burgerComposition;

    public BurgerCompositionDecorator(BurgerComposition newComposition){
        this.burgerComposition = newComposition;
    }

    public String getName() {
        return this.burgerComposition.getName();
    }

    public double getCalorieContent() {
        return this.burgerComposition.getCalorieContent();
    }

    public double getPrice() {
        return this.burgerComposition.getPrice();
    }
}
