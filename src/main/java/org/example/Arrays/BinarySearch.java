package org.example.Arrays;

public class BinarySearch {

    public static int search(int[] arr,int key ){
        int n=arr.length;
        if(n==0)
            return -1;
        int s=0;
        int e=n-1;

        while(s<=e){
            int mid=(s+e)/2;

            if(arr[mid]==key)
                return mid;
            else if(arr[mid]<key){
                s=mid+1;
            }
            else e=mid-1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        int key=11;
        int result= search(arr,key);

        System.out.println(result);
    }
}
