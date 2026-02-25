import java.sql.SQLOutput;
import java.util.Scanner;

class star {
    void pattern () {
        for (int i = 0; i < 6; i++) {
           for (int j = 0 ; j < i-1; j++){
               System.out.print("*");

           }
            System.out.println();
        }
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println(" Program to Print Multiplication Table of a Number using Method    ");
        star obj = new star();



        obj.pattern();
    }








    }

