import java.util.Scanner;

public class LibraryManagement {

    static String[] books = new String[5];
    static int count = 0;

    static void addBook(String book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full!");
        }
    }

    static void viewBooks() {
        if (count == 0) {
            System.out.println("No books available!");
            return;
        }

        System.out.println("\n===== BOOK LIST =====");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }

    static void searchBook(String name) {
        for (int i = 0; i < count; i++) {
            if (books[i].equalsIgnoreCase(name)) {
                System.out.println("Book found: " + books[i]);
                return;
            }
        }

        System.out.println("Book not found!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter book name: ");
                    String book = sc.nextLine();
                    addBook(book);
                    break;

                case 2:
                    viewBooks();
                    break;

                case 3:
                    System.out.print("Enter book to search: ");
                    String name = sc.nextLine();
                    searchBook(name);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
              }
