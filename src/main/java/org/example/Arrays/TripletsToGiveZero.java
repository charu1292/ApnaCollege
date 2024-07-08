package org.example.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class TripletsToGiveZero {

    public static void findTriplets(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0 ) {
                        System.out.println(nums[i] + "," + nums[j] + "," + nums[k]);
                    }
                }

            }

        }
    }


    public static List<List<Integer>> threeSum(int nums[]) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
    }



     public static void main (String[]args){
                    int[] nums = {};
                    findTriplets(nums);
//         List<List<Integer>> triplets = threeSum(nums);
//         for (List<Integer> triplet : triplets) {
//             System.out.println(triplet);
//         }
                }

            }
