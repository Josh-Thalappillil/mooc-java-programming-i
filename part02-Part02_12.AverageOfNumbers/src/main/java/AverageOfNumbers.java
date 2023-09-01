
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;


        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();

            if (input != 0) {
                sum += input;
                count++;
            } else {
                break;
            }
        }
        System.out.println("Average of the numbers: " + ((double)sum/count));
    }
}