package org.problems.Arrays;

public class MoveZero {
    public static void main(String[] args) {

        moveZeroes(new int[]{0,1,0,3,12});
    }
    public static void moveZeroes(int[] nums) {

        int i =0;
        int j = nums.length-1;
        while(i<j)
        {
            if(nums[i]==0)
            {
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j--;
            }
            else
            {
                i++;
            }
            System.out.println(nums[i] +" "+ nums[j]);
        }
    }
}
