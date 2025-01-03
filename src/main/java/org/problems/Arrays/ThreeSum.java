package org.problems.Arrays;

import java.util.*;

class ThreeSum {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list = new HashSet();
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> temp = new ArrayList();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    list.add(temp);
                    j++;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        output.addAll(list);
        return output;
    }
}
