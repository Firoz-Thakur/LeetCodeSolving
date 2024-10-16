package org.problems.strings;

import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {


    public static void main(String[] args) {

        String[] words = new String[]{"GRCCCCCCCCCCCCCCCCC","other","every","base","acording","GRC","level","meeting","none","marriage","rest"};
        System.out.println(shortestCompletingWord("Grcc8950", words));
    }

//    O(words) * O(licen)
//
//    O(x)

//    G->0
//    R-> 0
//    C->0

    public static String shortestCompletingWord(String licensePlate, String[] words) {

        String finalRes = null;
        licensePlate = licensePlate.toLowerCase();
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < licensePlate.length(); i++) {
            if (licensePlate.charAt(i) >= 'a' && licensePlate.charAt(i) <= 'z')
                mp.put(licensePlate.charAt(i), mp.getOrDefault(licensePlate.charAt(i), 0) + 1);
        }
        //O(n)
        //GrC8950
        for (String str : words) {
            Map<Character, Integer> temp = new HashMap<>(mp);
            for (int j = 0; j < str.length(); j++)
                if (temp.containsKey(str.charAt(j))) {
                    {
                        temp.put(str.charAt(j), temp.get(str.charAt(j)) - 1);
                    }
                }
            boolean flag = true;
            for (Map.Entry<Character, Integer> entry : temp.entrySet()) {
                if (entry.getValue() != 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                if (finalRes == null)
                    finalRes = str;
                else if (finalRes.length() > str.length())
                    finalRes = str;
            }
        }
        return finalRes;
    }


}
