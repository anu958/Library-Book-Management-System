import java.util.*;

public class LibrarySystem {
    private Map<String, Book> books;

    public LibrarySystem() {
        books = new HashMap<>();
    }

    // Add a book
    public void addBook(String bookId, String title, String author, String genre, String availabilityStatus) {
        if (books.containsKey(bookId)) {
            System.out.println("Error: Book ID already exists.");
        } else {
            books.put(bookId, new Book(bookId, title, author, genre, availabilityStatus));
            System.out.println("Book added successfully.");
        }
    }

    // View all books
    public void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the catalog.");
        } else {
            for (Book book : books.values()) {
                System.out.println(book);
            }
        }
    }

    // Search book by ID or Title
    public void searchBook(String searchTerm) {
        boolean found = false;
        for (Book book : books.values()) {
            if (book.getBookId().equalsIgnoreCase(searchTerm) || book.getTitle().equalsIgnoreCase(searchTerm)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with ID or Title: " + searchTerm);
        }
    }

    // Update book details
    public void updateBook(String bookId, String newTitle, String newAuthor, String newAvailabilityStatus) {
        Book book = books.get(bookId);
        if (book != null) {
            book.setTitle(newTitle);
            book.setAuthor(newAuthor);
            book.setAvailabilityStatus(newAvailabilityStatus);
            System.out.println("Book details updated successfully.");
        } else {
            System.out.println("Book not found with ID: " + bookId);
        }
    }

    // Delete a book
    public void deleteBook(String bookId) {
        if (books.containsKey(bookId)) {
            books.remove(bookId);
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("No book found with ID: " + bookId);
        }
    }
}

