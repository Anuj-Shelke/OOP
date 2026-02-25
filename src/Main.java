import java.sql.SQLOutput;
import java.util.Scanner;


class addition{
    int add(int a , int b ){
        return (a+b);

    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(" Method with return value  ");

        addition obj  = new addition();
        int result  = obj.add(4, 5 );
        System.out.println(result);
    }
}
