package additionalchallenge;

class Student {
    private int rollNo;
    private String name;
    private double marks;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Student s = new Student();

        s.setRollNo(101);
        s.setName("Tanuja");
        s.setMarks(89.5);

        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}
