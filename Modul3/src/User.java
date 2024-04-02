import java.util.ArrayList;
import java.util.Scanner;


public class User {
    public String name;
    protected ArrayList<Book> bookList;

    public User(String name) {
        this.name = name;
        bookList = new ArrayList<>();
    }

    public User(String name, ArrayList<Book> bookList) {
        this.name = name;
        this.bookList = bookList;
    }

    public void displayBooks() {
        System.out.println("\n===== Available Books ======================================================================================");
        System.out.printf("|| %-15s || %-25s || %-25s || %-20s || %-3s ||", "Book ID", "Title", "Author", "Category", "Stock");
        System.out.println("\n============================================================================================================");
        for (Book book : bookList) {
            System.out.printf("|| %-15s || %-25s || %-25s || %-20s || %-3s ||", book.getBookId(), book.getTitle(), book.getAuthor(), book.getCategory(), book.getStock());
            System.out.println();
        }
    }

    public void addBook(String bookId, String title, String author, String category, int stock, String bookType) {
        Book newBook;
        switch (bookType) {
            case "History":
                newBook = new HistoryBook(bookId, title, author, category, stock);
                break;
            case "Text":
                newBook = new TextBook(bookId, title, author, category, stock);
                break;
            case "Story":
                newBook = new StoryBook(bookId, title, author, category, stock);
                break;
            default:
                System.out.println("Invalid book type.");
                return;
        }
        bookList.add(newBook);
        System.out.println("Book added successfully.");
    }
}

class Admin extends User {
    public Admin(String name) {
        super(name);
    }

    public void addStudent(ArrayList<Student> userStudent) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter NIM: ");
        String nim = scanner.nextLine();
        if (nim.length() != 15) {
            System.out.println("Invalid NIM. NIM must be 15 digits.");
            addStudent(userStudent);
            return;
        }
        System.out.print("Enter Faculty: ");
        String faculty = scanner.nextLine();
        System.out.print("Enter Program: ");
        String program = scanner.nextLine();

        Student newStudent = new Student(name, nim, faculty, program);
        userStudent.add(newStudent);
        System.out.println("Student added successfully.");
    }

    public void inputBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        String bookId = scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Category (History, Text, or Story): ");
        String category = scanner.nextLine();
        System.out.print("Enter Stock: ");
        int stock = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String bookType = category;

        super.addBook(bookId, title, author, category, stock, bookType);
    }
}

class Student extends User {
    public String nim;
    public String faculty;
    public String program;

    public Student(String name, String nim, String faculty, String program) {
        super(name);
        this.nim = nim;
        this.faculty = faculty;
        this.program = program;
    }

    public void borrowBook(ArrayList<Book> bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book ID to borrow: ");
        String bookId = scanner.nextLine();
        System.out.print("Enter the duration in days (e.g., 7, 14, 30): ");
        int durationDays = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (Book book : bookList) {
            if (book.getBookId().equals(bookId)) {
                found = true;
                book.borrowBook(durationDays);
                break;
            }
        }
        if (!found) {
            System.out.println("Book with the given ID not found.");
        }
    }

    public void returnBook(ArrayList<Book> bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book ID to return: ");
        String bookId = scanner.nextLine();

        boolean found = false;
        for (Book book : bookList) {
            if (book.getBookId().equals(bookId)) {
                found = true;
                book.returnBook();
                break;
            }
        }
        if (!found) {
            System.out.println("Book with the given ID not found or not borrowed by you.");
        }
    }

    public void showBorrowedBook(ArrayList<Book> bookList) {
        System.out.println("\n===== Borrowed Books =====");
        boolean hasBorrowedBooks = false;
        for (Book book : bookList) {
            if (book.getBorrowedCount() > 0) {
                hasBorrowedBooks = true;
                System.out.printf("|| %-15s || %-25s || %-25s || %-20s || %-10s || %-10s ||\n", book.getBookId(), book.getTitle(), book.getAuthor(), book.getCategory(), book.getBorrowedDate(), "Due in " + book.getDurationDays() + " days");
            }
        }
        if (!hasBorrowedBooks) {
            System.out.println("You haven't borrowed any books yet.");
        }
    }
}
