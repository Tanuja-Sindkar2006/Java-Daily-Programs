package oveloadding;

class Addition {

    // Method with 2 integer parameters
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // Overloaded method with 3 integer parameters
    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Addition addition = new Addition();

        addition.add(10, 20);
        addition.add(10, 20, 30);
    }
}
