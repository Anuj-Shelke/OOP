import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Problem Statement Develop a Java program that performs various operations on arrays, including displaying\n" +
                "elements, finding the maximum and minimum elements, calculating the sum and average\n" +
                "of elements, and searching for a specific element within the array.. ");
        int arr [] = {1,2,3,5,6};
        System.out.println("The Array Elements Are ");
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        int i = 0 ;
        int max = arr[i];
        //Finding Maximum Elements
        for( i = 0 ; i < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i] ;
            }

        }
        System.out.println("The  Maximum Element of the Array is : "+max);
        int min = arr[0];
        for(i = 0 ; i < arr.length ; i++ ){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("The Minimum Element of the Array is :  "+min);


        int sum = 0 ;
        for( i = 0 ; i < arr.length ; i++){
            sum = sum+arr[i];
        }
        System.out.println("Sum of Array Elements is : "+sum );
        System.out.println("Avg of Array Elements is : "+sum/5);

        // Searching Specific Element in an Array

        System.out.println("Enter the element You Want to Search ");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        for( i = 0 ; i < arr.length; i++ ){
            if(arr[i] == element ){
                System.out.println("The element "+ element + " is found at index : "+i);
            }
        }
    }
}
