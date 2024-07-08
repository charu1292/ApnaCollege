package org.example.Arrays;

public class ReverseArray {


    public static void reverse(int[] arr){
        int n=arr.length;
        for(int i=0,j=n-1;i<j;i++,j--){
            swap(arr,i,j);
        }

    }

    private static void swap(int[]arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
