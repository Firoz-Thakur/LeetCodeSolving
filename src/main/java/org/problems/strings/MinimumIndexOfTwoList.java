package org.problems.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexOfTwoList {
    public static void main(String[] args) {

        String[] list1 = new String[]{"happy", "sad", "good"};
        String[] list2 = new String[]{"sad", "happy", "good"};
        System.out.println(findRestaurant(list1, list2).toString());
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {

        Map<String, Integer> mp1 = new HashMap<>();
        Map<String, Integer> mp2 = new HashMap<>();
        for (int i = list2.length - 1; i >= 0; i--) {
            mp2.put(list2[i], i);
        }
        // for (int i = list1.length-1; i >= 0; i--) {
        //     mp1.put(list1[i], i);
        // }
        int index = 0;
        int minMinvalue = Integer.MAX_VALUE;
        for (String x : list1) {
            if (mp2.containsKey(x)) {
                mp1.put(x, mp2.get(x) + index);
                minMinvalue = Math.min(minMinvalue, mp2.get(x) + index);
            }
            index++;
        }
        List<String> finalString = new ArrayList<>();
        int j = 0;
        for (Map.Entry<String, Integer> entry : mp1.entrySet()) {
            if (entry.getValue().equals(minMinvalue)) {
                finalString.add(entry.getKey());
            }
            j++;
        }
        return finalString.toArray(new String[0]);

    }
}
