package CodexCode.OOPMasterChallenge;

public class DeluxeBurger extends Burger {
    private Item deluxeExtra1;
    private Item deluxeExtra2;

    public DeluxeBurger() {
        super("Deluxe Burger", 14.50);
    }

    @Override
    protected Item createExtra(String name) {
        if (name == null || name.isBlank()) {
            return null;
        }
        return new Item("TOPPING", name, 0.0);
    }

    @Override
    public double getPrice() {
        return getBasePrice();
    }

    @Override
    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        super.addBurgerToppings(extra1, extra2, extra3);
    }

    public void addDeluxeToppings(String extra4, String extra5) {
        this.deluxeExtra1 = createExtra(extra4);
        this.deluxeExtra2 = createExtra(extra5);
    }

    @Override
    public void printItemizedBurger() {
        super.printItemizedBurger();
        printExtra(deluxeExtra1);
        printExtra(deluxeExtra2);
    }
}
