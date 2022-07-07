package com.fasttrack.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TimeMesurmentMain {
    public static void main(String[] args) {
        Map<String, Integer> nameToAge = new HashMap<>();
        for (int i = 0; i < 10_000_000; i++) {
            nameToAge.put(String.format("Name%d", i), i);
        }
        long time1, time2;


        long start = System.currentTimeMillis();
        Set<String> keys = nameToAge.keySet();
        for (String key : keys) {
            String.format("Person %s has %d years.", key, nameToAge.get(key));
        }
        time2 = System.currentTimeMillis() - start;


        start = System.currentTimeMillis();
        Set<Map.Entry<String, Integer>> entries = nameToAge.entrySet();
        for (Map.Entry entry : entries) {
            String.format("Person %s has %d years.", entry.getKey(), entry.getValue());
        }
        time1 = System.currentTimeMillis() - start;

        System.out.println(String.format("%d - %d", time1, time2));

    }

    public static void timeComplexity(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                // operation;  O(n*log(n)*log(log(n)))
            }
        }
    }
}
