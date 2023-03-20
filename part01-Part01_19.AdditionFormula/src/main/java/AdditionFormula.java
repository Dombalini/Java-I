
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        
        System.out.println("Give the first number:");
        
        int number1 = scanner.nextInt();
        
        System.out.println("Give the second number:");
        
        int number2= scanner.nextInt();
        
        int sum = number1 + number2;
        
        System.out.println(number1 + " + " + number2 + " = " + sum);
        
        
        

    }
}
