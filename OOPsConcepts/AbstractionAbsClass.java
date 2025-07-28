package OOPsConcepts;

abstract class Tv{
    abstract void turnOn();
    abstract void turnOff();
}
class Remote extends Tv{
    void turnOn(){
        System.out.println("Turn ON the TV");
    }
    void turnOff(){
        System.out.println("Turn OFF the Tv");
    }
}
public class AbstractionAbsClass {
    public static void main(String[] args){
        Tv myRemote = new Remote();
        myRemote.turnOn();
        myRemote.turnOff();
    }
}
