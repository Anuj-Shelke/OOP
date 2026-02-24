import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Program to Print Array Elements in reverse Order   ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number You Want to Search ");
        int a = sc.nextInt();
        int marks[] = {12, 13, 13, 14, 16};
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {

            if (marks[i] == a) {
                System.out.println("ELement is found found at index : " + i);
            }
        }
    }
}




