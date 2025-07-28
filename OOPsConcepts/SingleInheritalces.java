package OOPsConcepts;

class Animal{
    void sounds(){

        System.out.println("animal makes a sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("dog barks");

    }
}
public class SingleInheritalces {
    public static void main(String[] args){
        Dog d = new Dog();
        d.sounds();
        d.bark();

    }

}
