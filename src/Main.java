import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Program to Print Array Elements in reverse Order   ");
        int marks[] = {12, 13, 13, 14, 16};
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
            sum = sum + marks[i];
        }
        System.out.println("Sum is : " +sum);


    }
}
