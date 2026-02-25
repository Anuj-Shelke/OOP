import java.sql.SQLOutput;
import java.util.Scanner;

class student{
    String name ;
    int marks ;
    void display(){
        System.out.println("Welcome : "+name );
        System.out.println("Yours marks are : "+marks);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(" Method using Instance Variable   ");
        student obj = new student() ;
        obj.name = "anuj";
        obj.marks = 29;
        obj.display();

    }
}
