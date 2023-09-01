
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;


        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();

            if (input == 0) {
                System.out.println("Number of numbers: " + count + "\nSum of the numbers: " + sum);
                break;
            } else {
                sum = input + sum;
                count += 1;
                continue;
            }
        }
    }
}
