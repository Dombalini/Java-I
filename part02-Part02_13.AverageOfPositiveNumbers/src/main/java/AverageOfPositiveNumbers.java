
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCounter = 0;
        int sumPositive = 0;

        while (true) {
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            } else if (input > 0) {
                positiveCounter++;
                sumPositive += input;
            }
        }
        if (positiveCounter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double averagePositive = (double) sumPositive / positiveCounter;
            System.out.println(averagePositive);
        }
    }
}
