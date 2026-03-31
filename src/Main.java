import java.sql.SQLOutput;
import java.util.Scanner;
class Product{
    int id ;
    String name ;
    int price ;
    int qty;

    //Constructor
    Product(int id , String name, int price , int qty){
        this.id = id ;
        this.name = name ;
        this.price = price;
        this.qty = qty;


        }
    double total(){
        return price*qty;
    }

}
public class Main{
    public static void main(String[] args){
        Scanner  sc = new Scanner (System.in);
        System.out.println("Enter Number of Products ");
        int n = sc.nextInt();
        double grandtotal = 0;

        System.out.println("Enter Product Details");
        for (int i = 0 ; i< n ; i++){
            System.out.println("Enter ID ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name ");
            String name = sc.nextLine();

            System.out.println("Enter Price ");
            int price = sc.nextInt();

            System.out.println("Enter Quantity ");
            int qty = sc.nextInt();

            Product p = new Product(id , name , price, qty);
            grandtotal += p.total();

        }
        double discount = 0 ;
        if(grandtotal > 10000){
            discount = grandtotal* 0.10 ;
        }
        else if(grandtotal > 5000){
            discount = grandtotal*20 ;
        }
        double final_amount = grandtotal - discount;
        System.out.println("==========Invoice============");
        System.out.println("Total : "+grandtotal);
        System.out.println("discount : "+discount);
        System.out.println("final amount : "+final_amount);
        sc.close();
    }
}

