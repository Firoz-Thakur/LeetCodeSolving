package org.problems.strings;

import java.util.*;

public class MaxCount {
    public static void main(String[] args) {


    }
    public String mostCommonWord(String p, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> count = new HashMap<>();
        String[] words = p.replaceAll("\\W+", " ").toLowerCase().split("\\s+");
        for (String w : words)
            if (!ban.contains(w))
                count.put(w, count.getOrDefault(w, 0) + 1);

      //  int x = Collections.max(count.entrySet(),Map.Entry.comparingByValue()).getKey();
        return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
