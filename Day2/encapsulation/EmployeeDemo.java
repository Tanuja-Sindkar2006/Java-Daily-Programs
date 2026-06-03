package encapsulation;

class Employee {
    private int employeeId;
    private String name;
    private double salary;

    // Setter methods
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setEmployeeId(1001);
        emp.setName("Tanuja");
        emp.setSalary(50000);

        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
}
