import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldestName = ""; // Initialize oldestName to an empty string
        int maxAge = Integer.MIN_VALUE; // Initialize maxAge to the smallest possible integer value

        while (true) {
            String input = scanner.nextLine();

            // Stop if the input is empty
            if (input.isEmpty()) {
                break;
            }

            // Split the input by comma to separate name and age
            String[] parts = input.split(",");

            // Extract name and age
            String name = parts[0].trim();
            int age = Integer.parseInt(parts[1].trim());

            // Update oldestName if the current age is greater
            if (age > maxAge) {
                maxAge = age;
                oldestName = name;
            }
        }

        // Print the name of the oldest person
        System.out.println("Name of the oldest: " + oldestName);
    }
}
