package encapsulation;

class Student {
    // Private data members
    private int rollNo;
    private String name;

    // Setter methods
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.setRollNo(101);
        s.setName("Tanuja");

        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
    }
}
