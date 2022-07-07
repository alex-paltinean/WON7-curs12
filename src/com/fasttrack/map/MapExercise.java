package com.fasttrack.map;

import java.util.*;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, Integer> nameToAge = new HashMap<>();

        nameToAge.put("Ana", 30);
        nameToAge.put("Ionel", 20);
        nameToAge.put("Raluca", 25);
        nameToAge.put("Dragos", 40);

        System.out.println(nameToAge);
        System.out.println(nameToAge.keySet());

        nameToAge.put("Ana", 40);
        System.out.println(nameToAge);

        nameToAge.putIfAbsent("Ana", 50);
        System.out.println(nameToAge);

        System.out.println(nameToAge.get("Ana"));
        // printeaza null pentru ca nu gaseste cheia
        System.out.println(nameToAge.get("Ana123"));

        if (nameToAge.containsKey("Ana123")) {
            System.out.println("Found Ana123");
        } else {
            System.out.println("Ana123 wasn't found");
        }

        if (nameToAge.containsValue(20)) {
            System.out.println("Found a person that is 20 years old!");
        } else {
            System.out.println("Not 20 years old person here");
        }

        Integer dragosAge = nameToAge.remove("Dragos");
        System.out.println(dragosAge);
        System.out.println(nameToAge);

        System.out.println(nameToAge.values());
        Set<Map.Entry<String, Integer>> entries = nameToAge.entrySet();
        for (Map.Entry entry : entries) {
            System.out.println(String.format("Person %s has %d years.", entry.getKey(), entry.getValue()));
        }

        Set<String> keys = nameToAge.keySet();
        for (String key : keys) {
            System.out.println(String.format("Person %s has %d years.", key, nameToAge.get(key)));
        }

        Map<String, List<Integer>> grades = new HashMap<>();
        List<Integer> alexGrades = new ArrayList<>();
        alexGrades.add(10);
        grades.put("Alex", alexGrades);

        List<Integer> integers = grades.get("Alex");
        integers.add(12);

        System.out.println(grades);

        personMapExercise();
    }

    public static void personMapExercise() {
        Map<Person, Integer> persons = new HashMap<>();
        persons.put(new Person("123", "George", 17), 536);
        persons.put(new Person("123", "George", 17), 123);
        System.out.println(persons);
    }
}
