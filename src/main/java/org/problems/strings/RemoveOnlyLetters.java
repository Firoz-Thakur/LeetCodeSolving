package org.problems.strings;

import java.util.Stack;

public class RemoveOnlyLetters {
    public static void main(String[] args) {

        reverseOnlyLetters("sdfaskdhfkjasdfasdf");
    }

    public static String reverseOnlyLetters(String s) {

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                st.push(s.charAt(i));
            }
        }
        String res = new String();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                res+=st.peek();
                st.pop();
            }
            else
            {
                res+=s.charAt(i);
            }
        }
        return res;
    }
}
