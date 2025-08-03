package oopsconcepts;

public class BasicMethodOverloading {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        BasicMethodOverloading calc = new BasicMethodOverloading();

        System.out.println("addition =" + calc.add(2, 2));
        System.out.println("addition =" + calc.add(2, 5, 4));
        System.out.println("addition =" + calc.add(5.5, 2.5));
    }
}
