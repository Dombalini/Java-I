
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        
        int first = scanner.nextInt();
        System.out.println("Give the second number:");
        
        int second = scanner.nextInt();
        
        int sum = first + second;
        int sub = first - second;
        int mult = first * second;
        double div = (double)first / second;
        
        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + sub);
        System.out.println(first + " * " + second + " = " + mult);
        System.out.println(first + " / " + second + " = " + div);
      

    }
}

