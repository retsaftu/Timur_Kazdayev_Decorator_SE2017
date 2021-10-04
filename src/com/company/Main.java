package com.company;

import com.company.BurgerComposition;
import com.company.meat.BeefCutlet;
import com.company.sesame.SesameBuns;
import com.company.souce.BBQ;
import com.company.souce.Cheese;
import com.company.supplements.Bacon;
import com.company.supplements.Onion;
import com.company.supplements.Potatoes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BurgerComposition burger = new Potatoes(new Bacon(new BBQ(new BeefCutlet(new Cheese(new com.company.supplements.Cheese(new Onion(new SesameBuns())))))));
        System.out.println("Bash burger consists of: "+burger.getName());
        System.out.println("Price: "+burger.getCalorieContent());
        System.out.println("Calorie content : "+burger.getPrice());
    }
}
