
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true){
            int input = scanner.nextInt();
            if (input == 0){
                break;
            } else if (input > 0){
                sum += input;
                count++;
            }
        }
        if (sum > 0){
            System.out.println((double)sum/count);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
