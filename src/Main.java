import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID/Title");
            System.out.println("4. Update Book Details");
            System.out.println("5. Delete a Book");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Add a book
                    System.out.print("Enter Book ID: ");
                    String addBookId = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Book Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter Availability (Available/Checked Out): ");
                    String availabilityStatus = scanner.nextLine();
                    librarySystem.addBook(addBookId, title, author, genre, availabilityStatus);
                    break;

                case 2:
                    // View all books
                    librarySystem.viewAllBooks();
                    break;

                case 3:
                    // Search book by ID/Title
                    System.out.print("Enter Book ID or Title to search: ");
                    String searchTerm = scanner.nextLine();
                    librarySystem.searchBook(searchTerm);
                    break;

                case 4:
                    // Update book details
                    System.out.print("Enter Book ID to update: ");
                    String updateBookId = scanner.nextLine();
                    System.out.print("Enter new Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new Author: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Enter new Availability (Available/Checked Out): ");
                    String newAvailabilityStatus = scanner.nextLine();
                    librarySystem.updateBook(updateBookId, newTitle, newAuthor, newAvailabilityStatus);
                    break;

                case 5:
                    // Delete a book
                    System.out.print("Enter Book ID to delete: ");
                    String deleteBookId = scanner.nextLine();
                    librarySystem.deleteBook(deleteBookId);
                    break;

                case 6:
                    // Exit the program
                    running = false;
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}


