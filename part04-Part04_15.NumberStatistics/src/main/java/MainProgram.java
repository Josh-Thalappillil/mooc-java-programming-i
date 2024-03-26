import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Statistics totalSum = new Statistics();
        Statistics evenSum = new Statistics();
        Statistics oddSum = new Statistics();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }

            totalSum.addNumber(number);
            if (number % 2 == 0) {
                evenSum.addNumber(number);
            } else {
                oddSum.addNumber(number);
            }
        }

        System.out.println("Sum: " + totalSum.sum());
        System.out.println("Sum of even numbers: " + evenSum.sum());
        System.out.println("Sum of odd numbers: " + oddSum.sum());
    }
}

