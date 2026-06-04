package array;

import java.util.ArrayList;

public class RetrieveElement {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        String fruit = fruits.get(2);

        System.out.println("Element at index 2: " + fruit);
    }
}