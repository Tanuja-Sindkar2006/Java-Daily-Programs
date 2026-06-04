package array;

import java.util.ArrayList;

public class IntegerList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("Elements in ArrayList:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
