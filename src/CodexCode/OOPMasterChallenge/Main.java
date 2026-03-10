package CodexCode.OOPMasterChallenge;

public class Main {
    public static void main(String[] args) {
        MealOrder defaultMeal = new MealOrder();
        defaultMeal.setDrinkSize("SMALL");
        defaultMeal.printItemizedList();

        System.out.println();

        MealOrder customMeal = new MealOrder("Cheeseburger", "Sprite", "Onion Rings");
        customMeal.addBurgerToppings("Cheese", "Bacon", "Avocado");
        customMeal.setDrinkSize("LARGE");
        customMeal.printItemizedList();

        System.out.println();

        DeluxeMealOrder deluxeMeal = new DeluxeMealOrder("Coke", "Fries");
        deluxeMeal.addBurgerToppings("Cheese", "Bacon", "Avocado", "Ham", "Salami");
        deluxeMeal.setDrinkSize("LARGE");
        deluxeMeal.printItemizedList();
    }
}
