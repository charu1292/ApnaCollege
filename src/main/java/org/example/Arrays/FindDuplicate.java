package org.example.Arrays;
//Given an integer array nums, return true if any value appears at least
// twice in the array, and return false if every element is distinct


import java.util.HashSet;

//we can sort the array,and compare with [i-1]
public class FindDuplicate {

    public static boolean findDuplicate(int[] nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean findDuplicateUsingHashset(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums={1,4,1,1,2,2,2,3,4};
        System.out.println(findDuplicate(nums));
    }
}
