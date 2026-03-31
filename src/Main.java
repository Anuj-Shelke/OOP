class Animal{
    void eats() {
        System.out.println("Animal eats Food");
    }
}
class Dog extends Animal{
    void barks(){
        System.out.println("The dog is Barking");
    }

}
public class Main{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.barks();
        d.eats();
    }
}

