import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAge = Integer.MIN_VALUE; // Initialize maxAge to the smallest possible integer value

        while (true) {
            String input = scanner.nextLine();

            // Stop if the input is empty
            if (input.isEmpty()) {
                break;
            }

            // Split the input by comma to separate name and age
            String[] parts = input.split(",");

            // Extract age and convert it to an integer
            int age = Integer.parseInt(parts[1].trim());

            // Update maxAge if the current age is greater
            if (age > maxAge) {
                maxAge = age;
            }
        }

        // Print the age of the oldest person
        System.out.println("Age of the oldest: " + maxAge);
    }
}
