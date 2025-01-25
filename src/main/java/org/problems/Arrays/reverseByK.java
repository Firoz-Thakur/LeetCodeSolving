package org.problems.Arrays;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.reverse;

public class reverseByK {

    public static void main(String[] args) {
        reverseArray(new int[]{1,2,3,4,5,6,7,8},8,3);
    }
    public static void reverseArray(int[] ar, int n, int k) {
        // Reverse the entire array
        k = n%k;
        reverse(ar, 0, n);
        // Reverse the first k elements
        reverse(ar, 0, k);
        // Reverse the elements from k to n
        reverse(ar, k, n);
    }

    private static void reverse(int[] ar, int start, int end) {
        while (start < end) {
            int temp = ar[start];
            ar[start] = ar[end - 1];
            ar[end - 1] = temp;
            start++;
            end--;
        }
    }
}
