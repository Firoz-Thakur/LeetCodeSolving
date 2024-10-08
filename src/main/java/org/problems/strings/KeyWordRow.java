package org.problems.strings;

import java.util.*;

public class KeyWordRow {
    public static void main(String[] args) {
        String[] sb = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(findWords(sb));
    }

    public static String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
//        String[] sb = new String[0];
        ArrayList<String> sb = new ArrayList<>();
        int j=0;
        for (String word : words) {
            word = word.toLowerCase();
            Map<String, Boolean> mp = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                if (s1.contains(String.valueOf(word.charAt(i))))
                    mp.put(s1, true);
                if (s2.contains(String.valueOf(word.charAt(i))))
                    mp.put(s2, true);
                if (s3.contains(String.valueOf(word.charAt(i))))
                    mp.put(s3, true);
            }
            if (mp.size() == 1) {
                sb.add(word);
                j++;
            }
        }
        return sb.toArray(new String[0]);
    }
}
