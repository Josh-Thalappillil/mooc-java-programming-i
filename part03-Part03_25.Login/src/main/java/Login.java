import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the usernames and passwords
        String[] usernames = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};

        // Prompt the user to enter username and password
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check if the entered username and password match
        boolean isAuthenticated = false;
        for (int i = 0; i < usernames.length; i++) {
            if (username.equals(usernames[i]) && password.equals(passwords[i])) {
                isAuthenticated = true;
                break;
            }
        }

        // Display the result based on authentication
        if (isAuthenticated) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password.");
        }
    }
}
