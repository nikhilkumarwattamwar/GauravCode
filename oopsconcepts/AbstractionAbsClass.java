package oopsconcepts;

abstract class TV{
    abstract void turnOn();
    abstract void turnOff();
}
class Remote extends TV{
    void turnOn(){
        System.out.println("Turn ON the TV");
    }
    void turnOff(){
        System.out.println("Turn OFF the Tv");
    }
}
public class AbstractionAbsClass {
    public static void main(String[] args){
        TV myRemote = new Remote();
        myRemote.turnOn();
        myRemote.turnOff();
    }
}
