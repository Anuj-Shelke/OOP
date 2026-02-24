import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Program to calculate Average marks of Students Present in an array    ");
        double  marks[] = {12, 13, 13, 14, 16};
        double avg = 0 ;
        double  sum = 0;
        for (int i = 0 ; i< 5; i++ ){
            sum  =  (sum + marks[i]);
        }
        avg = sum/5;
        System.out.println("The average is "+avg);




    }
}




