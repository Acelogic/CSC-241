package Coursework.Hashmaps.Demo3;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Prius", "12345678");
        Car c2 = new Car("Ford", "Bronco", "23456789");

        HashMap<String, Car> carMap = new HashMap<>();

        carMap.put(c1.getVin(), c1);
        carMap.put(c2.getVin(), c2);

        System.out.println("---=== TESTING OUT GETS ===---");
        System.out.println( carMap.get(c1.getVin()));
        System.out.println( carMap.get(c2.getVin()));

        System.out.println("---=== TESTING OUT CONTAINS ===---");
        System.out.println(carMap.containsKey(c1.getVin()));

        System.out.println("---=== TESTING OUT KEYSET ITERATING ===---");
        for(String k : carMap.keySet()) {
            System.out.println(carMap.get(k));
        }


        carMap.remove(c2.getVin());
        System.out.println("---=== REMOVED C2 ===---");
        for(String k : carMap.keySet()) {
            System.out.println(carMap.get(k));
        }

        System.out.println("---=== REPLACED C1 WITH C2 ===--");
        carMap.replace(c1.getVin(), c2);

        for(String k : carMap.keySet()) {
            System.out.println(carMap.get(k));
        }


        System.out.println(carMap.values());

        }
}
