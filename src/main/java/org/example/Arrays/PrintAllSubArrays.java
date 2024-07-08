package org.example.Arrays;

//total num of subarrays =n*(n+1)/2 =15

public class PrintAllSubArrays {
    public static void subArray(int[] arr){
        int n=arr.length;
        int ts=0;
        for(int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays are:" + ts);
    }


    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        subArray(arr);
    }
}
