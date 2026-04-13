package CodexCode;

import java.util.Arrays;
import java.util.Random;

public class Lesson125Challenge {

    public static void main(String[] args) {

        int[] unsortedArray = getRandomArray(5);
        System.out.println("Unsorted array = " + Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(unsortedArray);
        System.out.println("Sorted array = " + Arrays.toString(sortedArray));
    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] randomArray = new int[len];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(1000);
        }

        return randomArray;
    }

    private static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
