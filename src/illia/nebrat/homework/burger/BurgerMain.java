package illia.nebrat.homework.burger;

public class BurgerMain {
    public static void main(String[] args) {
        Burger classicBurger = new Burger("bun", "meat", "cheese", "salad greens", "mayonnaise.");
        Burger dietBurger = new Burger("bun", "meat", "cheese", "salad greens.");
        Burger doubleMeatBurger = new Burger("bun", "meat", "additional meat", "cheese", "salad greens", "mayonnaise.");
    }
}
