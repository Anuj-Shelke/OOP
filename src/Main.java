import java.sql.SQLOutput;
import java.util.Scanner;

class mul {
    void table(int num) {
        for (int i = 0; i < 11; i++) {
            System.out.println(num + " x " + i + "=" + (num * i));

        }
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println(" Program to Print Multiplication Table of a Number using Method    ");
        mul obj = new mul();
        System.out.println("Enter the number You want the multiplication table of ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        obj.table(n);
    }








    }

