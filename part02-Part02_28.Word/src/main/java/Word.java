
import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String greeting = word(); // greeting is now "Hello"
        System.out.println(word() + ", world!"); // prints "Hello, world!"

    }

    public static String word() {
        return "Hello";
    }
}
