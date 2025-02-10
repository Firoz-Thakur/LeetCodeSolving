package org.problems.strings;

import java.util.HashMap;
import java.util.Map;

public class FindPairs {

    public static void main(String[] args) {

        maximumNumberOfStringPairs(new String[]{"cd","ac","dc","ca","zz"});

    }
    public static int maximumNumberOfStringPairs(String[] words) {
        Map<String , Boolean> mp = new HashMap<>();
        int count=0;
        for(String x : words)
        {
            StringBuilder sb = new StringBuilder(x);
            if(mp.containsKey(sb.reverse().toString()))
            {
                count++;
            }
            mp.put(sb.toString(),true);
        }
        return count;
    }
}
