import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create an ArrayList to store television programs
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Read television programs from the user
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break; // Stop reading programs if name is empty
            }

            System.out.print("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());

            // Create TelevisionProgram object and add it to the list
            programs.add(new TelevisionProgram(name, duration));
        }

        // Ask user for maximum duration
        System.out.print("\nProgram's maximum duration? ");
        int maxDuration = Integer.parseInt(scanner.nextLine());

        // Print programs with duration less than or equal to maxDuration
        System.out.println("\nTelevision programs:");
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program.getName() + ", " + program.getDuration() + " minutes");
            }
        }
    }
}
