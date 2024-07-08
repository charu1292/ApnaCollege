package org.example.ArraysSort;
//time complexity= n~2
//in this we try to find the smallest and push it to front of the array
public class SelectionSort {
    public static void sort(int arr[]){
        for (int i=0 ; i<arr.length-1;i++){ //number of turns
             int smallest=i;
             for (int j=i+1; j<arr.length;j++){
                 if(arr[smallest] > arr[j]){ // change to < to sort in descending order
                     smallest=j; //update the smallest index
                 }
             }
             //swapping in outer loop
            int temp=arr[smallest];
             arr[smallest]=arr[i];
             arr[i]=temp;
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }


    public static void main(String[] args) {
        int arr[]={2,3,4,1,0,7};
        sort(arr);
        printArr(arr);

    }
}
