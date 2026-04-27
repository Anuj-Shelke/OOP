import java.util.Scanner;

class Product {
    int id, price, qty;
    String name;

    Product(int id, String name, int price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    double total() {
        return price * qty;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of products:");
        int n = sc.nextInt();

        double grandTotal = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter id:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter name:");
            String name = sc.nextLine();

            System.out.println("Enter price:");
            int price = sc.nextInt();

            System.out.println("Enter quantity:");
            int qty = sc.nextInt();

            Product p = new Product(id, name, price, qty);
            grandTotal = grandTotal + p.total();
        }

        double discount = 0;

        if (grandTotal > 10000) {
            discount = grandTotal * 0.10;
        }
        else if (grandTotal > 5000) {
            discount = grandTotal * 0.05;
        }

        double finalAmount = grandTotal - discount;

        System.out.println("Total Amount = " + grandTotal);
        System.out.println("Discount = " + discount);
        System.out.println("Final Amount = " + finalAmount);

        sc.close();
    }
}