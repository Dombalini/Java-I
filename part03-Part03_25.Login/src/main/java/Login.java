
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] users = {
            {"alex", "sunshine"},
            {"emma", "haskell"}
        };

        // ask for username and password
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // check if username and password are valid
        boolean valid = false;
        for (String[] user : users) {
            if (user[0].equals(username) && user[1].equals(password)) {
                valid = true;
                break;
            }
        }

        // display appropriate message
        if (valid) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
