package CodexCode.OOPMasterChallenge;

public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super("BURGER", name, price);
    }

    public double getPrice() {
        return getBasePrice()
                + getExtraPrice(extra1)
                + getExtraPrice(extra2)
                + getExtraPrice(extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        this.extra1 = createExtra(extra1);
        this.extra2 = createExtra(extra2);
        this.extra3 = createExtra(extra3);
    }

    protected Item createExtra(String name) {
        if (name == null || name.isBlank()) {
            return null;
        }
        return new Item("TOPPING", name, getExtraPriceByType(name));
    }

    protected double getExtraPriceByType(String name) {
        return switch (name.toUpperCase()) {
            case "AVOCADO", "CHEESE" -> 1.00;
            case "BACON", "HAM", "SALAMI" -> 1.50;
            default -> 0.00;
        };
    }

    private double getExtraPrice(Item extra) {
        return extra == null ? 0.0 : extra.getAdjustedPrice();
    }

    public void printItemizedBurger() {
        printItem(getAdjustedName(), getBasePrice());
        printExtra(extra1);
        printExtra(extra2);
        printExtra(extra3);
    }

    protected void printExtra(Item extra) {
        if (extra != null) {
            extra.printItem(extra.getName(), extra.getAdjustedPrice());
        }
    }
}
