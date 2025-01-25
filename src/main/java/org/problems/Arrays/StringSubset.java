package org.problems.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringSubset {
    public static void main(String[] args) {
        System.out.println(wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"}, new String[]{"e","o"}));

    }
    public static List<String> wordSubsets(String[] words1, String[] words2) {

        List<String> list= new ArrayList();
        Map<String, Map<Character,Integer>> mp = new HashMap();

        for(String s: words1) {
            Map<Character, Integer> mp2 = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                mp2.put(s.charAt(i), mp2.getOrDefault(s.charAt(i), 0) + 1);
            }
            mp.put(s, mp2);
        }

        for(String s6 : mp.keySet())
        {
            Map<Character,Integer> values = mp.get(s6);
            int f=0;
            for(String w: words2)
            {
                Map<Character,Integer> wordsCount = new HashMap<>();

                for(int i =0;i<w.length();i++)
                {
                    wordsCount.put(w.charAt(i),wordsCount.getOrDefault(w.charAt(i),0)+1);
                }

                 for(int i=0;i<w.length();i++)
                {
                       if(values.getOrDefault(w.charAt(i),0)<(wordsCount.get(w.charAt(i))))
                       {
                           f=1;
                           break;
                       }
                }

            }
            if(f==0)
                list.add(s6);

        }
        return list;
    }

}
