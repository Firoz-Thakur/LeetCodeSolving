package org.problems.strings;

public class SumTwoNumbers {

    public static void main(String[] args) {

       System.out.println(addStrings("199", "9"));
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int sum = 0;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int dum=0;
            dum = carry;
            if (i >= 0 && j >= 0) {
                dum = carry+Integer.parseInt(String.valueOf(num1.charAt(i))) + Integer.parseInt(String.valueOf(num2.charAt(j)));
                carry = dum/10;
            } else if (i >= 0) {
                dum = carry + Integer.parseInt(String.valueOf(num1.charAt(i)));
                carry = dum / 10;
            } else if (j >= 0) {
                dum = carry + Integer.parseInt(String.valueOf(num2.charAt(j)));
                carry = dum / 10;
            }
            System.out.println(sum);
            sb.append(dum%10);
            i--;
            j--;
        }
        if(carry>0)
            sb.append(carry);
        sb.reverse();
        return sb.toString();
    }

}

