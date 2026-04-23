package Arrays;

import java.util.Scanner;

public class SmallestValueChallenge {
    public static void main(String[] args) {

    }

    public static int[] readIntegers (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of integers, separated by commas");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin (int[] array) {
        int min = Integer.MAX_VALUE;

        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

}
