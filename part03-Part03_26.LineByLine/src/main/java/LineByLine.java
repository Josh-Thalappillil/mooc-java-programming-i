import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            // Stop if the input is empty
            if (input.isEmpty()) {
                break;
            }

            // Split the input string by whitespaces and print each part
            String[] parts = input.split("\\s+");
            for (String part : parts) {
                System.out.println(part);
            }
        }
    }
}
