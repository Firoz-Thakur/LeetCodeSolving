package org.problems.Arrays;

public class ProductOfArray {

    public int[] productExceptSelf(int[] nums) {

        int pre[] = new int[nums.length];
        int suff[] = new int[nums.length];

        pre[0] = nums[0];
        suff[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] * nums[i];
            suff[nums.length - i - 1] = suff[nums.length - i] * nums[nums.length - i - 1];
        }

        nums[0] = suff[1];
        nums[nums.length - 1] = pre[nums.length - 2];

        for (int i = 1; i < nums.length - 1; i++) {
            nums[i] = pre[i - 1] * suff[i + 1];
        }
        return nums;
    }

}
