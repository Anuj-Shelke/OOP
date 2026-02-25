import java.sql.SQLOutput;
import java.util.Scanner;

class square{
    int factorial(int n ){
        if(n== 0 || n == 1 ){
            return 1;
        }
        else{
           return n * factorial(n-1);
        }

    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println(" Program to Factorial of a number    ");
         square obj  = new square() ;
         int fact = obj.factorial(2);


        System.out.println("The Factorial of the number is  : "+fact  );




    }
}
