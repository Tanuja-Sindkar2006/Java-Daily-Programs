package additionalchallenge;

abstract class Bank {
    abstract double getInterestRate();

    void calculateInterest(double amount) {
        double interest = amount * getInterestRate() / 100;
        System.out.println("Interest = " + interest);
    }
}

class SBI extends Bank {

    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {

    double getInterestRate() {
        return 7.0;
    }
}

class ICICI extends Bank {

    double getInterestRate() {
        return 7.5;
    }
}

public class BankDemo {
    public static void main(String[] args) {

        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        System.out.println("SBI:");
        b1.calculateInterest(10000);

        System.out.println("HDFC:");
        b2.calculateInterest(10000);

        System.out.println("ICICI:");
        b3.calculateInterest(10000);
    }
}