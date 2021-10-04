package com.company.sesame;

import com.company.BurgerComposition;

public class SesameBuns implements BurgerComposition {
    @Override
    public String getName() {
        return "SesameBuns";
    }

    @Override
    public double getPrice() {
        return 1.0;
    }

    @Override
    public double getCalorieContent() {
        return 0.5;
    }
}
