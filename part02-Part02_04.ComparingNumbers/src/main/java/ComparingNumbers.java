
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inputOne = scanner.nextInt();
        int inputTwo = scanner.nextInt();
        
        if(inputOne > inputTwo){
            System.out.println(inputOne + " is greater than " + inputTwo);
        }else if (inputOne < inputTwo){
            System.out.println(inputOne + " is smaller than " + inputTwo);
        }else{
            System.out.println(inputOne + " is equal to " + inputTwo);
        }

    }
}
