package CodexCode.OOPMasterChallenge;

public class DeluxeMealOrder extends MealOrder {

    public DeluxeMealOrder(String drinkName, String sideName) {
        super("Deluxe Burger", drinkName, sideName);
        setBurger(new DeluxeBurger());
    }

    @Override
    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        getBurger().addBurgerToppings(extra1, extra2, extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3,
                                  String extra4, String extra5) {
        DeluxeBurger burger = (DeluxeBurger) getBurger();
        burger.addBurgerToppings(extra1, extra2, extra3);
        burger.addDeluxeToppings(extra4, extra5);
    }

    @Override
    public double getTotalPrice() {
        return getBurger().getPrice();
    }

    @Override
    public void printItemizedList() {
        getBurger().printItemizedBurger();
        getDrink().printItem(getDrink().getAdjustedName(), 0.0);
        getSide().printItem(getSide().getAdjustedName(), 0.0);
        System.out.printf("%-20s %6.2f%n", "TOTAL PRICE", getTotalPrice());
    }
}
