package array;

import java.util.ArrayList;

public class CityList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Kolkata");

        System.out.println("Cities: " + cities);
        System.out.println("Size of ArrayList: " + cities.size());
    }
}