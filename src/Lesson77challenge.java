import java.util.Scanner;

public class Lesson77Challenge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int validCount = 0;
        int sum = 0;
        while (validCount < 5) {
            System.out.println("Enter a number, this will be number #" + (validCount + 1));
            String value = scanner.nextLine();

            try {
                int number = Integer.parseInt(value);
                sum += number;
                validCount++;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid");
            }
        }
        System.out.print("The sume of all the numbers are " + sum);
    }
}
