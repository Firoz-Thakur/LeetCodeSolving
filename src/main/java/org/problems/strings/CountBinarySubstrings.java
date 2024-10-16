package org.problems.strings;

public class CountBinarySubstrings {

    public static void main(String[] args) {

        System.out.println(countBinarySubstrings("0000111110"));
    }

    public static int countBinarySubstrings(String s) {
        int result = 0;
        int cur = 1;
        int prev = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                cur++;
            else {
                result = Math.min(cur, prev);  // result = 4 +
                prev = cur;
                cur=1;
            }
        }
        return result + Math.min(cur,prev);
    }
}
