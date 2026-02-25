import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Program Statement Implement a robust Java calculator program that captures user input dynamically,\n" +
                "processes mathematical expressions using conditional logic and looping constructs, and\n" +
                "ensures efficient error handling. ");

        System.out.println("Enter Number A ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter Number B ");
        int b = sc.nextInt();
        System.out.println("Enter 1 For Addition ");
        System.out.println("Enter 2 For Multiplication ");
        System.out.println("Enter 3 for Division ");
        System.out.println("Enter 4 for Substraction ");
        int x = sc.nextInt();
        switch (x)
        {
            case 1 :
                System.out.println("The Addition of the Numbers is "+(a+b));
                break;
            case 2 :
                System.out.println("The Multiplication of Numbers is "+a*b);
                break;
            case 3 :
                System.out.println("The Division of Numbers is "+a/b);
                break;
            case 4 :
                System.out.println("The Substraction of Numbers is "+(a-b));
                break;
            default:
                System.out.println("Enter a valid response ");
                break;

        }
    }
}
