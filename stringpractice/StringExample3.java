package stringpractice;
import java.util.*;

public class StringExample3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your city name");
        String name = sc.nextLine().toLowerCase().trim();
        if (name.equals("pune")){
            System.out.println("welcome to pune");
        }
        else if (name.equals("mumbai")) {
            System.out.println("welcome to mumbai");
        }
        else if (name.equals("Navi Mumbai")) {
            System.out.println("welcome to navi mumbai");
        }
        else if (name.equals("jalgaon")) {
            System.out.println("welcome to jalgaon");
        }
        else {
            System.out.println("Please enter valid city name");
        }
    }
}
