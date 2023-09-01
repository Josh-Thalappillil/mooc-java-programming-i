
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int numbers = 0;
        int sum = 0;
        int odd = 0;
        int even = 0;

        while (true) {
            int input = scanner.nextInt();

            if (input == -1) {
                break;
            }

            if (input > -1) {
                numbers++;
                sum += input;

                if (input % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + (double)sum/numbers);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
