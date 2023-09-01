
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int userNum = (scanner.nextInt()) + 1;
        int result = 0;

        for (int i = 1; i < userNum; i++){
            result += i;
//            System.out.println(i); Left this here for my understanding.
        }
        System.out.println(result);
    }
}
