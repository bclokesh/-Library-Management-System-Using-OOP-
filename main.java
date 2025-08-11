import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Adding sample books and users
        library.addBook(new Book("Java Basics", "John Doe"));
        library.addBook(new Book("Python 101", "Jane Smith"));
        library.addUser(new User("Alice", 1));
        library.addUser(new User("Bob", 2));

        int choice;
        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Show Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.showBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = sc.nextLine();
                    System.out.print("Enter user ID: ");
                    int userId = sc.nextInt();
                    sc.nextLine();
                    library.issueBook(issueTitle, userId);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = sc.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
