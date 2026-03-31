import java.sql.SQLOutput;

class Pen{
    String color ;
    String type ;
    public void write(){
        System.out.println("Writing Something ");
    }
}
public class Main {
public static void main(String[] args){
    Pen pen1 = new Pen();
    pen1.color = "red";
    pen1.type = "Ball";
    System.out.println(pen1.color);
    System.out.println(pen1.type);
    pen1.write();
    }
}