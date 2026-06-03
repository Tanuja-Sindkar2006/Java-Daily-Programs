package additionalchallenge;

abstract class Animal {
    abstract void sound();
    abstract void eat();
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks.");
    }

    void eat() {
        System.out.println("Dog eats meat.");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows.");
    }

    void eat() {
        System.out.println("Cat drinks milk.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();

        d.sound();
        d.eat();

        c.sound();
        c.eat();
    }
}