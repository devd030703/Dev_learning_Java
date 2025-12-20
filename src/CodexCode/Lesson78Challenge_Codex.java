package CodexCode;

import java.util.Scanner;

public class Lesson78Challenge_Codex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasValidNumber = false;
        double min = 0;
        double max = 0;

        while (true) {
            System.out.println("Enter a number or any character to quit:");
            String input = scanner.nextLine();

            double number;
            try {
                number = Double.parseDouble(input);
            } catch (NumberFormatException ex) {
                break;
            }

            if (!hasValidNumber) {
                min = number;
                max = number;
                hasValidNumber = true;
                continue;
            }

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        if (hasValidNumber) {
            System.out.println("Minimum number: " + min);
            System.out.println("Maximum number: " + max);
        } else {
            System.out.println("No valid numbers entered.");
        }
    }
}
