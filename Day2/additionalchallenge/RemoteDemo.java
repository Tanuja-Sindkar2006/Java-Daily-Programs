package additionalchallenge;

interface RemoteControl {
    void turnOn();
    void turnOff();
}

class TV implements RemoteControl {

    public void turnOn() {
        System.out.println("TV is turned ON.");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

class AirConditioner implements RemoteControl {

    public void turnOn() {
        System.out.println("Air Conditioner is turned ON.");
    }

    public void turnOff() {
        System.out.println("Air Conditioner is turned OFF.");
    }
}

public class RemoteDemo {
    public static void main(String[] args) {
        RemoteControl tv = new TV();
        RemoteControl ac = new AirConditioner();

        tv.turnOn();
        tv.turnOff();

        ac.turnOn();
        ac.turnOff();
    }
}
