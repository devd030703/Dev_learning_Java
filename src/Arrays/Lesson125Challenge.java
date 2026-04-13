package Arrays;

import java.util.Random;
import java.util.Arrays;

public class Lesson125Challenge {

    public static void main (String [] args) {

        int[] unsortedArray = getRandomArray(5);
        System.out.println("Unsorted array = " + Arrays.toString(unsortedArray));

        int[] sortedArray = sortInteger(unsortedArray);
        System.out.println("Sorted array = " + Arrays.toString(sortedArray));
    }

    public static int[] getRandomArray (int length) {
        Random random = new Random();
        int[] randomArray = new int[length];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }

    public static int[] sortInteger(int[] array){

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag){
            flag = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i +1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray [i+1];
                    sortedArray [i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
