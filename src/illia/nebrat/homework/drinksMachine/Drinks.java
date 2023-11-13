package illia.nebrat.homework.drinksMachine;

import java.util.Scanner;

class Drinks {
    static int totalDrinks = 0;
    static double totalCost = 0.0;

    public static void makeDrink(DrinksMachine drink) {
        System.out.println("Making " + drink.getName() + "...");
        totalDrinks++;
        totalCost += drink.getPrice();
    }
}


