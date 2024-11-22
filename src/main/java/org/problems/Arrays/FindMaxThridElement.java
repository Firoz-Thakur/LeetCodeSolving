package org.problems.Arrays;

import java.util.TreeSet;

public class FindMaxThridElement {
    public static void main(String[] args) {
        thirdMax(new int[]{1, 9,8,5,3, 5});
    }
    public static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) {
                set.remove(set.first());
            }
        }
        return set.size() < 3 ? set.last() : set.first();
    }
}
