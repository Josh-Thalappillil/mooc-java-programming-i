import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                int cube = number * number * number;
                System.out.println(cube);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'end' to quit.");
            }
        }

        scanner.close();
    }
}
