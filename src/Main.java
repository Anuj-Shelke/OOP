import java.util.*;

class Book {

    int id;
    String name;
    boolean issued;

    static int totalBooks = 0;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
        this.issued = false;
        totalBooks++;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Issued: " + issued);
        System.out.println("-------------------");
    }

    void issue() {
        if (!issued) {
            issued = true;
            System.out.println("Book Issued");
        } else {
            System.out.println("Already Issued");
        }
    }

    void returnBook() {
        if (issued) {
            issued = false;
            System.out.println("Book Returned");
        } else {
            System.out.println("Book was not issued");
        }
    }

    // ✅ STATIC METHOD (IMPORTANT FIX)
    static void showTotalBooks() {
        System.out.println("Total Books: " + totalBooks);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();

        int choice, id;
        String name;

        do {

            System.out.println("\n1.Add  2.View  3.Issue  4.Return  5.Total  6.Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("ID Name: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    name = sc.nextLine();

                    library.add(new Book(id, name));
                    break;

                case 2:
                    for (Book b : library)
                        b.display();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    id = sc.nextInt();

                    for (Book b : library)
                        if (b.id == id)
                            b.issue();
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    id = sc.nextInt();

                    for (Book b : library)
                        if (b.id == id)
                            b.returnBook();
                    break;

                case 5:
                    Book.showTotalBooks(); // ✅ static method call
                    break;

                case 6:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Wrong Choice");
            }

        } while (choice != 6);
    }
}