package oopsconcepts;

class Human{
    void show(){
        System.out.println("Human body");
    }
}
class Men extends Human{
    void play(){
        System.out.println("men is playing");
    }
}
class Child extends Men{
    void sing(){
        System.out.println("Child is singing");
    }
}
public class MultilevelInheritancesBsic {
    public static void main (String[] args){
        Child objchild = new Child();

        objchild.show();
        objchild.play();
        objchild.sing();
    }
}
