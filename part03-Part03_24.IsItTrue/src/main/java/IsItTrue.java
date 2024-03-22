import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("true")) { // Compare input ignoring case
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
