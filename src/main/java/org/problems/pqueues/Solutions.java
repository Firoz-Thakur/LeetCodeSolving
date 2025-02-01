package org.problems.pqueues;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public  class Solutions {
    static class Pairx {
        int count;
        char chr;

        Pairx(int count, char chr) {
            this.count = count;
            this.chr = chr;
        }
    }
    public String frequencySort(String s) {
        // Create a frequency map to count occurrences of each character
        Map<Character, Integer> mp = new HashMap<>();
        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        // Create a priority queue to store the character-frequency pairs
        PriorityQueue<Pairx> pq = new PriorityQueue<>((a, b) -> b.count - a.count);  // Sort by frequency in descending order

        for (char ch : mp.keySet()) {
            pq.offer(new Pairx(mp.get(ch), ch));
        }

        // Build the result string using the characters in order of frequency
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Pairx p = pq.poll();
            int count = p.count;
            while (count > 0) {
                sb.append(p.chr);  // Append the character as many times as its frequency
                count--;
            }
        }

        // Return the resulting string
        return sb.toString();
    }
}