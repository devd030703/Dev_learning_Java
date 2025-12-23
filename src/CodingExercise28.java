import java.util.Scanner;

public class CodingExercise28 {

    public static void main(String[] args) {
        inputSumAndAverage();
    }
    public static void inputSumAndAverage (){
        Scanner scanner = new Scanner (System.in);
        long sum = 0;
        long count = 0;

        while (true){
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
        }
        long average = count > 0 ? Math.round((double) sum / count) : 0;
        System.out.println("The average is " + average + " and the Sum is " + sum);
    }
}
