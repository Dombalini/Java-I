
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int totalBirthYears = 0;
        int numPeople = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            String name = parts[0].trim();
            int birthYear = Integer.parseInt(parts[1].trim());

            if (name.length() > longestName.length()) {
                longestName = name;
            }

            totalBirthYears += birthYear;
            numPeople++;
        }

        double averageBirthYear = (double) totalBirthYears / numPeople;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageBirthYear);

    }
}
