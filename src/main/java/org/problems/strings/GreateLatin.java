package org.problems.strings;

import java.util.Arrays;

public class GreateLatin {
    public static void main(String[] args) {

        System.out.println(toGoatLatin("I speak Goat Latin"));
    }

    public static String toGoatLatin(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb2 = new StringBuilder(words[i]);
            if(words[i].charAt(0)=='a' || words[i].charAt(0)=='e'||words[i].charAt(0)=='i'||words[i].charAt(0)=='o'||
            words[i].charAt(0)=='u'|| words[i].charAt(0)=='A' || words[i].charAt(0)=='E'||words[i].charAt(0)=='I'||words[i].charAt(0)=='O'||
                    words[i].charAt(0)=='U')
            {
                sb2.append("ma");
            }
            else {
                 char x = sb2.charAt(0);
                 sb2.deleteCharAt(0);
                 sb2.append(x);
                 sb2.append("ma");
            }
            for (int z = 0; z <= i; z++) {
                sb2.append("a");
            }
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(sb2);
        }
        return sb.toString();
    }

}
