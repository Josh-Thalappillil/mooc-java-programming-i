
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String str = scanner.nextLine();

        System.out.println("Give an integer:");
        int value = Integer.valueOf(scanner.nextLine());

        System.out.println("Give a double:");
        double decimal = Double.valueOf(scanner.nextLine());

        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + str + "\n" +
                "You gave the integer " + value + "\n" +
                "You gave the double " + decimal + "\n" +
                "You gave the boolean " +  bool);
    }
}
