package org.problems.Arrays;

import java.util.Arrays;

public class findContentChildren {

    public static void main(String[] args) {
        System.out.println(findContentChildren2(new int[]{1, 2}, new int[]{1, 2, 3}));
    }

    public static int findContentChildren2(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for(int j=0;i<g.length && j<s.length;j++) {
            if(g[i]<=s[j]) i++;
        }
        return i;




    }


}
