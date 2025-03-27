# Library-Book-Management-System

This Library Management System is designed to help librarians manage books effectively. It allows for adding, updating, searching, viewing, and deleting books while maintaining their availability status (Available or Checked Out).

## Features

- **Add a Book**: Allows librarians to add a book with a unique Book ID, Title, Author, Genre, and Availability Status.
- **View All Books**: Displays a list of all books in the system.
- **Search Book**: Allows searching for a book by its Book ID or Title.
- **Update Book**: Modify book details (Title, Author, Availability Status).
- **Delete Book**: Remove a book from the catalog by its Book ID.
- **Exit**: Close the application.

## Requirements

- Java 8 or higher
- IntelliJ IDEA or any Java IDE

## How to Setup and Run

1. **Clone the Repository**:
   Clone the repository to your local machine using the following command:
    git clone https://github.com/anu958/Library-Book-Management-System.git

2. **Open the Project in IntelliJ IDEA**:
    - Open IntelliJ IDEA and select **Open**.
    - Navigate to the project directory and select it.
    - IntelliJ will automatically configure the project for you.

3. **Run the Application**:
    - Open the `LibraryManagementSystem.java` file in your IDE.
    - Right-click on the file and select **Run** to start the application.

4. **Use the Application**:
    - Follow the on-screen menu to add, search, update, and delete books.
    - You will interact with the system via the console.

## Code Explanation

**`Book.java`**
This class defines the book's properties such as Book ID, Title, Author, Genre, and Availability Status. It also provides getter and setter methods and overrides the `toString` method to format the book information when printed.

**`LibraryManagementSystem.java`**
This class is the main application logic that handles the following functionalities:
- Adding a new book to the library.
- Viewing all books stored in the library.
- Searching for a book by Book ID or Title.
- Updating book details.
- Deleting a book from the catalog.

**`Main.java`**
- Handling user inputs through a console-based menu system.

**`Challenges Faced:`**
- Ensuring that the book ID is unique and validating user input to avoid errors.
- Keeping the code modular and easy to maintain as the system grows.

**`Improvements:`**
- Add persistent storage (e.g., database) instead of using in-memory data structures.
- Implement a graphical user interface (GUI) for better usability.
- Add more features like tracking borrowed dates or categorizing books.
