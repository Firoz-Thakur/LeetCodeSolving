package org.problems.collections.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        // Put some key-value pairs into the map
        map.put("Apple", 100);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Get value by key
        System.out.println("Value for key 'Apple': " + map.get("Apple")); // Output: 1
        System.out.println("Value for key 'invalid': " + map.get("invalid")); // Output: 1
        System.out.println("Value for key 'Apple': " + map.containsKey("invalid")); // Output: 1

        // Check if a key exists
        if (map.containsKey("Banana")) {
            System.out.println("Banana is in the map.");
        }

        // Check if a value exists
        if (map.containsValue(3)) {
            System.out.println("A value 3 is in the map.");
        }
        map.replace("Banana",23);
        System.out.println(map);
       // map.remove("Banana",23);
        System.out.println(map);
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            System.out.println("Key is '"+ entry.getKey() +"' Value is "+ entry.getValue());
        }

//        Example: Group elements in an array by how many times they appear.

        int[] arr = {4, 5, 6, 5, 4, 3};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        HashMap<Integer, List<Integer>> groupedByFrequency = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            int number = entry.getKey();
            groupedByFrequency.computeIfAbsent(frequency, k -> new ArrayList<>()).add(number);
//            groupedByFrequency.putIfAbsent(frequency,new ArrayList<>());
//            groupedByFrequency.get(frequency).add(number);
        }
        for (Integer freq : groupedByFrequency.keySet()) {
            System.out.println(freq + ": " + groupedByFrequency.get(freq));
        }
    }
}
