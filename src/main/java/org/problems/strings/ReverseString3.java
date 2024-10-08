package org.problems.strings;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collections.reverse;

public class ReverseString3 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {

        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word :  str) {
            StringBuilder sb2 = new StringBuilder(word);
            sb.append(sb2.reverse());
            sb.append(" ");
        }
        return sb.toString();
    }
}
