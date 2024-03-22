import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            // Stop if the input is empty
            if (input.isEmpty()) {
                break;
            }

            // Split the input string by spaces and print the first part
            String[] parts = input.split("\\s+");
            if (parts.length > 0) {
                System.out.println(parts[0]);
            }
        }
    }
}
