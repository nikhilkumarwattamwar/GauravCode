package oopsconcepts;

class Animals{
    void makeSound(String sound){
        System.out.println("Animals" + sound);
    }
}
class Dogs extends Animals{
    void makeSound(String sound){
        System.out.println("Dog" + sound);
    }
}
class Cat extends Dogs{
    void makeSound(String sound){
        System.out.println("cat " + sound);
    }
}
public class MethodOverriding1 {
    public static void main(String[] args) {

    Animals obj = new Cat();
    obj.makeSound("meaw");
    }
}
