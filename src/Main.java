import org.w3c.dom.ls.LSOutput;

abstract class animal{
    abstract void sound();
}

class dog extends animal{
    void sound(){
        System.out.println("DOG BARKS ");
    }
}

class cat extends  animal{
    void sound(){
        System.out.println("Cat Mews");
    }
}

public class Main{
    public static void main(String[] args){
        dog d = new dog();
        d.sound();

        cat c = new cat();
        c.sound();
    }
}