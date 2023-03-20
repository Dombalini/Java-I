
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inputOne = scanner.nextInt();
        int inputTwo = scanner.nextInt();
        double squareRoot = Math.sqrt(inputOne + inputTwo);
        System.out.println(squareRoot);

    }
}
