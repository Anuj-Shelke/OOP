import java.sql.SQLOutput;
import java.util.Scanner;

class square{
    int length ;
    int breadth ;
    int area(){
        return (length * breadth );
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println(" Method using Instance Variable   ");
         square obj  = new square() ;
        obj.length = 10;
        obj.breadth = 10 ;
         int area = obj.area();

        System.out.println("The area of the rectangle is : "+area );




    }
}
