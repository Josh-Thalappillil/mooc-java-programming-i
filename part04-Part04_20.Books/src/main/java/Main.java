import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        // Read book information from the user
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break; // Stop reading if title is empty
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, publicationYear));
        }

        // Ask user what information to print
        System.out.print("\nWhat information will be printed? ");
        String printOption = scanner.nextLine();

        // Print book information based on user input
        System.out.println();
        if (printOption.equals("everything")) {
            for (Book book : books) {
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getPublicationYear());
            }
        } else if (printOption.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
