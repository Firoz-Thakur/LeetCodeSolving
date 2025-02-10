package org.problems.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FyndTest {

    public static void main(String[] args) {

        findFirstAndLastOcc(new int[]{1,2,3,4,2,5,3,3,2,2,3,6,3},3);
    }

   /// time complex : O(n) + O(n)  ~ O(n)>
  // space : O(n)
    public static void findFirstAndLastOcc(int ar[],int key)
    {
        int firstIndex=-1;
        int lastIndex=-1;
        Map<Integer, List<Integer>> mp = new HashMap<>();
        for(int i=0;i<ar.length;i++) {
            mp.putIfAbsent(ar[i], new ArrayList<>());
            mp.get(ar[i]).add(i);
        }
        for(Integer ele: mp.keySet())
        {
            if(ele.equals(key)) {
                List<Integer> itemSearched = mp.get(ele);
                firstIndex = itemSearched.get(0);
                lastIndex = itemSearched.get(itemSearched.size() - 1);
                break;
            }
        }
        System.out.println("First index of key "+key+ " is "+ firstIndex);
        System.out.println("last index of key "+key+ " is "+ lastIndex);
    }
}
