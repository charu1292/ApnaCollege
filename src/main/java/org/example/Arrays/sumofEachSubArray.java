package org.example.Arrays;

public class sumofEachSubArray {
    public static void maxSubArray(int[] arr){
        int n=arr.length;
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                curr_sum=0;
                for (int k=i;k<=j;k++){
                    System.out.print(arr[k] + " "); // print all combination
                    //subarray sum
                    curr_sum+=arr[k];
                }
                System.out.println( "---> " + curr_sum);
                if(max_sum<curr_sum){
                    max_sum=curr_sum;
                }

            }
        }
        System.out.println("Max_Sum" + ":" + max_sum);
    }


    public static void main(String[] args) {
        int[] arr={1,-2,6,-1,3};
        maxSubArray(arr);
    }
}
