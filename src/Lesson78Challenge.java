import java.util.Scanner;

public class Lesson78Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidNumber = false;
        double min = 0;
        double max = 0;

        while (true) {
            System.out.println("Enter a number to create a list of numbers or enter any character to break the loop");
            String input = scanner.nextLine();

            double number;
            try {
                number = Double.parseDouble(input);
            } catch (NumberFormatException randomCharacter) {
                break;
            }

            if (!isValidNumber) {
                min = number;
                max = number;
                isValidNumber = true;
                continue;
            }

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        if (isValidNumber) {
            System.out.println("The minimum number is " + min);
            System.out.println("The maximum number is " + max);
        } else {
            System.out.println("No valid number were entered");
        }
    }
}