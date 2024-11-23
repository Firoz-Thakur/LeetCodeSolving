package org.problems.Arrays;

public class FindLongestOnesInAnArray {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1, 1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                c++;
            } else {
                result = Math.max(result, c);
                c = 0;
            }
        }
        result = Math.max(result, c);
        return result;
    }
}
