import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Program to Find minimum Element in an Array    ");
        System.out.println("Enter the Elements ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[5];

        for(int i = 0 ; i < 5 ; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 0 ; i < 5 ; i++){
            if(arr[i] < min ){
                min = arr[i];
            }
        }
        System.out.println("The minimum Element is "+min);
        }
        }





