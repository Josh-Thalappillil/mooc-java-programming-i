import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            // Stop if the input is empty
            if (input.isEmpty()) {
                break;
            }

            // Split the input string by spaces
            String[] parts = input.split("\\s+");

            // Print the last part if the array is not empty
            if (parts.length > 0) {
                System.out.println(parts[parts.length - 1]);
            }
        }
    }
}
