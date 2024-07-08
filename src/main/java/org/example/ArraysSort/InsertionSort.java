package org.example.ArraysSort;
//time complexity n~2
//idea : pick the element from unsorted part and place it at right position at sorted part
//
public class InsertionSort {

    public static void sort(int[] arr){
       for (int i=1;i<arr.length;i++){   //let A[0] is sorted and start the loop from 1
           int curr=arr[i];             // starting from element as current
           int prev=i-1;                // taking prev last element of sorted part
           //find out the correct position
           while(prev>=0 && arr[prev]>curr){ //run a loop to make a space until we found the correct position
               arr[prev+1]=arr[prev];     //shift the element to right
               prev--;
           }
           //insertion
           arr[prev+1]=curr;             // put the element in correct space
       }
    }
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        int[] arr={3,5,1,9,2,8};
        sort(arr);
        printArr(arr);
    }

}
