
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Give an number:");
        
        int exact = Integer.valueOf(scan.nextLine());
        
        if(exact == 1984){
            System.out.println("Orwell");
        }
        
    }
}
