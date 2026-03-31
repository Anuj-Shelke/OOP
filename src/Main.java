import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter Array Elements ");
        for(int i = 0 ; i< n ; i ++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Elements of Array are ");
        for (int i = 0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
        int min = arr[0];
        int max = arr[0];
        for(int i = 0 ; i< n ; i++){
            if(arr[i]< min ){
                min = arr[i];
            }
            if(arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println("The minimum Element of the Array is "+min);
        System.out.println("The Maximum Element of the Array is "+max);
        int sum = arr[0];
        for(int i = 0 ; i <n ; i++){
            sum = sum + arr[i];
        }
        int avg = sum/n;
        System.out.println("The Sum of the Array Elements is "+sum);
        System.out.println("The Avg of the Array Elements is "+avg);
        System.out.println("Enter the Element You want to search for ");
        int num = sc.nextInt();
        boolean found = false ;
        for(int i =  0  ; i< n ; i++){
            if(num == arr[i]){
                System.out.println("The element is found at index "+i);
                found = true ;
            }
        }
        if(!found){
            System.out.println("The element is not present in the Array ");
        }
    }
}