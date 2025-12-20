package CodexCode;

import java.util.Scanner;

public class Lesson77Challenge_Codex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (args.length > 0) {
            System.out.print("Command-line arguments: ");
            for (String arg : args) {
                System.out.print(arg + " ");
            }
            System.out.println();
        }
        int validCount = 0;
        int sum = 0;

        while (validCount < 5) {
            System.out.println("Enter number #" + (validCount + 1) + ":");
            String value = scanner.nextLine();

            try {
                int number = Integer.parseInt(value);
                sum += number;
                validCount++;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid number");
            }
        }

        System.out.println("Sum: " + sum);
    }
}
