import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Understanding Method Creation and Calling  ");
        class greet{
            void hello(){
                System.out.println("Hello jiii ");
            }
        }
        greet obj = new greet();
        obj.hello();

    }
}
