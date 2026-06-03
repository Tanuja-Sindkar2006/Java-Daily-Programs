package abstractex;

abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key.");
    }

    void stop() {
        System.out.println("Car stops.");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a self-start button.");
    }

    void stop() {
        System.out.println("Bike stops.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v1.stop();

        v2.start();
        v2.stop();
    }
}