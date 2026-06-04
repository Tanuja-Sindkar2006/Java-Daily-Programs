package array;

import java.util.ArrayList;

public class StudentNames {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Amit");
        students.add("Priya");
        students.add("Rahul");
        students.add("Sneha");
        students.add("Karan");

        System.out.println("Student Names:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}
