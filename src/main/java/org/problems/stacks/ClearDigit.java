package org.problems.stacks;

import java.util.Stack;

public class ClearDigit {


    public static void main(String[] args) {


        System.out.println(clearDigits("cb"));

    }
    public static String clearDigits2(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.peek());
            stack.pop();
        }
        return sb.reverse().toString();
    }

    public static String clearDigits(String s) {
        StringBuilder stack = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.deleteCharAt(stack.length() - 1);
            } else {
                stack.append(ch);
            }
        }
        return stack.toString();
    }
}
