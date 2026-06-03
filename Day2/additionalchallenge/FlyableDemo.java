package additionalchallenge;

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flying in the sky.");
    }
}

class Airplane implements Flyable {
    public void fly() {
        System.out.println("Airplane is flying at high altitude.");
    }
}

public class FlyableDemo {
    public static void main(String[] args) {
        Flyable b = new Bird();
        Flyable a = new Airplane();

        b.fly();
        a.fly();
    }
}
