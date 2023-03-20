
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersCounted = 0;
        int numbersSum = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }
            numbersCounted++;
            numbersSum += input;
        }
        double averageOfNumbers = (double) numbersSum / numbersCounted;
        System.out.println("Average of the numbers: " + averageOfNumbers);
    }
}
