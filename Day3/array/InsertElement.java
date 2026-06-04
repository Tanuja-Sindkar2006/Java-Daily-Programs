package array;

import java.util.ArrayList;

public class InsertElement {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("C++");
        languages.add("JavaScript");

        languages.add(1, "Python");

        System.out.println("ArrayList after insertion:");
        System.out.println(languages);
    }
}