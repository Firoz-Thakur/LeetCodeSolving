package org.problems;

import java.util.ArrayList;
import java.util.List;

public class Range {
    public static void main(String[] args) {

        System.out.printf(summaryRanges(new int[]{1,2,3,5}));
    }
        public static String summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int first=0;
        int last=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]+1==nums[i+1])
            {
                last++;
                continue;
            }
            else {
                result.add(nums[first]+"->"+nums[last]);
                first=last+1;
                last=first;
            }
        }
        result.add(String.valueOf(nums[first]));
        return result.toString();
    }
}
