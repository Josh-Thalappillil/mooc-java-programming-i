
//import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something:");
        Boolean value = Boolean.valueOf(scanner.nextLine());

        System.out.println("True or false? " + value);



    }
}
