interface animal {
    void sound();
}
class dog implements animal{
    public void sound(){
        System.out.println("Dog Barks");
    }
}
class cat implements animal{
    public void sound(){
        System.out.println("Cat meows ");
    }
}
public class Main{
    public static void main(String[] args){
        animal a = new dog();
        a.sound();
        a = new cat();
        a.sound();
    }

}


