import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            // Stop if the input is empty
            if (input.isEmpty()) {
                break;
            }

            // Split the input string by spaces and print pieces containing "av"
            String[] parts = input.split("\\s+");
            for (String part : parts) {
                if (part.contains("av")) {
                    System.out.println(part);
                }
            }
        }
    }
}
