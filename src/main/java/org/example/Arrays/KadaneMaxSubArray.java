package org.example.Arrays;
//in this Kadane therem we calculate curr_sum at each point and whenever we get
// negative sum we make that 0 and compare with max sum
public class KadaneMaxSubArray {


    public static void KadanesMaxSum(int[] arr){
        int max_sum=Integer.MIN_VALUE;
        int curr_sum=0;
        for (int i=0;i<arr.length;i++){
            curr_sum=curr_sum+arr[i];
            // If current sum becomes negative, reset it to 0
            if(curr_sum<0){
                curr_sum=0;
            }
            // Update max_sum
            max_sum=Math.max(curr_sum,max_sum);
        }

        // Handle the case when all elements are negative
        if (max_sum== 0) {
            max_sum= arr[0];
            for (int i =1; i< arr.length; i++) {
                max_sum = Math.max(max_sum, arr[i]);
            }
        }

        System.out.println("Max sum is :" + max_sum);
    }


    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,-5,-3};
        KadanesMaxSum(arr);

    }
}
