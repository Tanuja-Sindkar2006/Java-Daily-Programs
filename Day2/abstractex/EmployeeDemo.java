package abstractex;

abstract class Employee {
    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    void calculateSalary() {
        System.out.println("Full-Time Employee Salary = " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    void calculateSalary() {
        double salary = hoursWorked * hourlyRate;
        System.out.println("Part-Time Employee Salary = " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(50000);
        Employee e2 = new PartTimeEmployee(40, 200);

        e1.calculateSalary();
        e2.calculateSalary();
    }
}