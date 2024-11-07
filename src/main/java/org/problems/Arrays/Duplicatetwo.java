package org.problems.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Math.abs;

public class Duplicatetwo {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,1};

        System.out.println(containsNearbyDuplicate(arr,3));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, List<Integer>> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
//            if (!mp.containsKey(nums[i])) {
//                mp.put(nums[i], new ArrayList<>());
//            }
//            mp.get(nums[i]).add(i);
            mp.computeIfAbsent(nums[i],x->new ArrayList<>()).add(i);
        }
        for(Map.Entry<Integer,List<Integer>> entry : mp.entrySet())
        {
            int a = entry.getKey();
            List<Integer> b = entry.getValue();
            if(b.size()>1) {
                for (int j = 0; j < b.size() - 1; j++) {
                    if (Math.abs(b.get(j) - b.get(j + 1)) <= k)
                        return true;
                }
            }
        }
        return false;
    }
}
