package org.example.ArraysSort;
//time complexity=n~2
//in this we keep pushing lasgest number to the end by swapping with every adjacent element
public class BubbleSort {

    public static void sort(int arr[]){
        int n=arr.length;
        int swapped=0;
        for(int turn=0;turn<n-1;turn++){
            for (int j=0; j<n-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped++;
                }
            }
        }
        // if swapped is zero then my array is already sorted
        System.out.println(swapped);
    }

    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }


    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,6,5};
        sort(arr);
        printArr(arr);
    }
}
