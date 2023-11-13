package illia.nebrat.homework.drinksMachine;

enum DrinksMachine {
    COFFEE("Press 1 to buy Coffee", 2.5), TEA("Press 2 to buy Tea", 2.0), LEMONADE("Press 3 to buy Lemonade", 1.5), MOJITO("Press 4 to buy Mojito", 3.0), MINERAL_WATER("Press 5 to buy Mineral Water", 1.0), COCA_COLA("Press 6 to buy Coca Cola", 2.0);

    private final String name;
    private final double price;

    DrinksMachine(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
