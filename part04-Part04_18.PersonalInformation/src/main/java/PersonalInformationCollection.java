import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Collect personal information
        while (true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break; // Exit loop if first name is empty
            }
            
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            
            System.out.print("Identification number: ");
            String identificationNumber = scanner.nextLine();

            // Create PersonalInformation object and add it to the collection
            infoCollection.add(new PersonalInformation(firstName, lastName, identificationNumber));
        }

        // Print collected personal information
        System.out.println("\nPersonal information:");
        for (PersonalInformation info : infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
    }
}
