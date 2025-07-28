package OOPsConcepts;

interface Humans{
    default void care(){
        System.out.println("human speak");
    }
}
interface Mother extends Humans {
    default void care(){
        System.out.println("mother speak");
    }
}
interface Father extends Humans{
    default void care(){
        System.out.println("father speak");
    }
}
class Son implements Mother,Father{
    public void care(){
        Father.super.care();
    }
}
public class DianmodProblem {
    public static void main(String[] args){
        Son son = new Son();
        son.care();
    }
}
