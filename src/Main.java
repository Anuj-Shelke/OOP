import java.util.*;

class Item {
    String name;
    double price;
    int qty;

    Item(String name, double price, int qty) {
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
        ArrayList<Item> cart = new ArrayList<>();

        int choice = 0;

        try {
            while (choice != 4) {

                System.out.println("\n1.Add Item  2.View Cart  3.Total Bill  4.Exit");
                System.out.print("Enter choice: ");
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                        try {
                            System.out.print("Enter name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter price: ");
                            double price = Double.parseDouble(sc.nextLine());

                            System.out.print("Enter quantity: ");
                            int qty = Integer.parseInt(sc.nextLine());

                            if (price < 0 || qty < 0)
                                throw new ArithmeticException();

                            cart.add(new Item(name, price, qty));
                            System.out.println("Item added!");
                        }
                        catch (Exception e) {
                            System.out.println("Invalid input!");
                        }
                        break;

                    case 2:
                        if (cart.isEmpty())
                            System.out.println("Cart is empty");
                        else {
                            for (Item i : cart)
                                System.out.println(i.name + " | " + i.total());
                        }
                        break;

                    case 3:
                        double sum = 0;
                        for (Item i : cart)
                            sum += i.total();

                        System.out.println("Total Bill = " + sum);
                        break;
                }

            }
        }
        finally {
            System.out.println("Program ended");
            sc.close();
        }
    }
}