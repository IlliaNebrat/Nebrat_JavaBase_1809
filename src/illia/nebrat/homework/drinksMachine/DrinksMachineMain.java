package illia.nebrat.homework.drinksMachine;

import java.util.Scanner;

import static illia.nebrat.homework.drinksMachine.Drinks.*;

public class DrinksMachineMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean orderMore = true;
        while (orderMore) {
            System.out.println("What would you like to drink?");
            for (DrinksMachine drink : DrinksMachine.values()) {
                System.out.println(drink.getName() + " - " + drink.getPrice() + " UAH");
            }
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    makeDrink(DrinksMachine.COFFEE);
                    break;
                case 2:
                    makeDrink(DrinksMachine.TEA);
                    break;
                case 3:
                    makeDrink(DrinksMachine.LEMONADE);
                    break;
                case 4:
                    makeDrink(DrinksMachine.MOJITO);
                    break;
                case 5:
                    makeDrink(DrinksMachine.MINERAL_WATER);
                    break;
                case 6:
                    makeDrink(DrinksMachine.COCA_COLA);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println("You ordered " + totalDrinks + " drinks so far.");
            System.out.println("Total cost: " + totalCost + " UAH.");
            System.out.println("Would you like to order more drinks? (y/n)");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("n")) {
                orderMore = false;
            }
        }
        System.out.println("You ordered " + totalDrinks + " drinks.");
        System.out.println("Total cost: " + totalCost + " UAH.");
    }
}

