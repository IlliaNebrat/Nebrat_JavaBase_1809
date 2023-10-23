package illia.nebrat.homework.burger;

public class Burger {
    private  String bun;
    private  String meat;
    private String additionalMeat;
    private  String cheese;
    private  String greenSalad;
    private  String mayonnaise;


    public Burger(String bun, String meat, String cheese, String greenSalad, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenSalad = greenSalad;
        this.mayonnaise = mayonnaise;

        System.out.println("Classic Burger: " + bun + ", " + meat + ", " + cheese + ", " + greenSalad + ", " + mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String greenSalad) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenSalad = greenSalad;

        System.out.println("Diet Burger: " + bun + ", " + meat + ", " + cheese + ", " + greenSalad);
    }

    public Burger (String bun, String meat, String additionalMeat, String cheese, String greenSalad, String mayonnaise) {
        this.bun = bun;
        this.cheese = cheese;
        this.greenSalad = greenSalad;
        this.mayonnaise = mayonnaise;
        this.meat = meat;
        this.additionalMeat = additionalMeat;


        System.out.println("Double meat Burger: " + bun + ", " + meat + ", " + additionalMeat + ", " + cheese + ", " + greenSalad + ", " + mayonnaise);
    }
}
