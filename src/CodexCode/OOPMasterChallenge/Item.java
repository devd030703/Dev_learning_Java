package CodexCode.OOPMasterChallenge;

public class Item {
    private String type;
    private String name;
    private double price;
    private String size;

    public Item(String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.size = "MEDIUM";
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getAdjustedName() {
        return switch (type.toUpperCase()) {
            case "DRINK" -> size + " " + name;
            default -> name;
        };
    }

    public double getAdjustedPrice() {
        return switch (type.toUpperCase()) {
            case "DRINK" -> switch (size.toUpperCase()) {
                case "SMALL" -> price;
                case "LARGE" -> price + 1.00;
                default -> price + 0.50;
            };
            default -> price;
        };
    }

    public void setSize(String size) {
        if (size == null || size.isBlank()) {
            return;
        }
        this.size = size.toUpperCase();
    }

    public void printItem() {
        System.out.printf("%-20s %6.2f%n", getAdjustedName(), getAdjustedPrice());
    }

    public void printItem(String name, double price) {
        System.out.printf("%-20s %6.2f%n", name, price);
    }
}
