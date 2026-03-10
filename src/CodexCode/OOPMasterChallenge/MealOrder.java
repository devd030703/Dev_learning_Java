package CodexCode.OOPMasterChallenge;

public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder() {
        this("Regular Burger", "Coke", "Fries");
    }

    public MealOrder(String burgerName, String drinkName, String sideName) {
        this.burger = new Burger(burgerName, getBurgerPrice(burgerName));
        this.drink = new Item("DRINK", drinkName, getDrinkPrice(drinkName));
        this.side = new Item("SIDE", sideName, getSidePrice(sideName));
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addBurgerToppings(extra1, extra2, extra3);
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

    public double getTotalPrice() {
        return burger.getPrice() + drink.getAdjustedPrice() + side.getAdjustedPrice();
    }

    public void printItemizedList() {
        burger.printItemizedBurger();
        drink.printItem();
        side.printItem();
        System.out.printf("%-20s %6.2f%n", "TOTAL PRICE", getTotalPrice());
    }

    protected Burger getBurger() {
        return burger;
    }

    protected void setBurger(Burger burger) {
        this.burger = burger;
    }

    protected Item getDrink() {
        return drink;
    }

    protected Item getSide() {
        return side;
    }

    private double getBurgerPrice(String burgerType) {
        return switch (burgerType.toUpperCase()) {
            case "REGULAR BURGER" -> 4.00;
            case "CHEESEBURGER" -> 5.00;
            case "BACON BURGER" -> 5.50;
            default -> 4.00;
        };
    }

    private double getDrinkPrice(String drinkType) {
        return switch (drinkType.toUpperCase()) {
            case "WATER" -> 1.50;
            case "SPRITE" -> 2.00;
            case "COKE" -> 2.00;
            default -> 2.00;
        };
    }

    private double getSidePrice(String sideType) {
        return switch (sideType.toUpperCase()) {
            case "ONION RINGS" -> 3.50;
            case "SALAD" -> 3.00;
            case "FRIES" -> 2.50;
            default -> 2.50;
        };
    }
}
