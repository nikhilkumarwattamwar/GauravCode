package OOPsConcepts;

public class MethodOverloading2 {
    public String info(String name){
    return name;
    }
    public String info(String name , String lastname){
        return name + lastname;
    }
    public String info(String name , int age){
        return name + age;
    }
    public static void main(String[] args){
        MethodOverloading2 obj = new MethodOverloading2();
        System.out.println(obj.info("gaurav"));
        System.out.println(obj.info("Gaurav","Sonawane"));
        System.out.println(obj.info("gaurav's"+ " age is " +25 ));
    }
}