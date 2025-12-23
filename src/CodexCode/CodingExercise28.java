package CodexCode;

import java.util.Scanner;

public class CodingExercise28 {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        long count = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
        }

        long average = count > 0 ? Math.round((double) sum / count) : 0;
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
