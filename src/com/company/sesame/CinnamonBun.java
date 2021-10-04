package com.company.sesame;

import com.company.BurgerComposition;

public class CinnamonBun implements BurgerComposition {
    @Override
    public String getName() {
        return "CinnamonBun";
    }

    @Override
    public double getPrice() {
        return 2.0;
    }

    @Override
    public double getCalorieContent() {
        return 1.5;
    }
}
