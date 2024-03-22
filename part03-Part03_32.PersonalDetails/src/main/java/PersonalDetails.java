import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = ""; // Initialize longestName to an empty string
        double totalBirthYears = 0; // Initialize totalBirthYears to 0
        int count = 0; // Initialize count to 0

        while (true) {
            String input = scanner.nextLine();

            // Stop if the input is empty
            if (input.isEmpty()) {
                break;
            }

            // Split the input by comma to separate name and birth year
            String[] parts = input.split(",");
            String name = parts[0].trim();
            int birthYear = Integer.parseInt(parts[1].trim());

            // Update longestName if the current name is longer
            if (name.length() > longestName.length()) {
                longestName = name;
            }

            // Add birth year to total and increment count
            totalBirthYears += birthYear;
            count++;
        }

        // Calculate average birth year
        double averageBirthYear = totalBirthYears / count;

        // Print the longest name and average birth year
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageBirthYear);
    }
}
