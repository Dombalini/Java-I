
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int end = scanner.nextInt();
        System.out.println("Where from?");
        int start = scanner.nextInt();

        if (end < start) {
            System.out.println("Nothing to print");
        } else {
            for (int i = start; i <= end; i++) {
                System.out.println(i);
            }
        }

    }
}
