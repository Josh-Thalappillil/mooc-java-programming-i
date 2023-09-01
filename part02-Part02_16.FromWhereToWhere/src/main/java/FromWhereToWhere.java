
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int input = scanner.nextInt();
        System.out.println("Where from?");
        int input2 = scanner.nextInt();

        for (int i = input2; i <= input; i++){
            System.out.println(i);
        }
    }
}
