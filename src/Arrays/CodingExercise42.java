package Arrays;

import java.util.Scanner;

public class CodingExercise42 {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int arrayLength) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[arrayLength];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int el: array) {
            if (el < min) {
                min = el;
            }
        }

        return min;
    }
}
