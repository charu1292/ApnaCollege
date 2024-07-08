package org.example.Loops_practice;

//Write a program that reads a set of integers,and then prints the sum of the
// even and odd integers.

public class SumofOddEvenIntegers {

    public static void sumEvenOdd(int[] arr){

        int sumeven=0;
        int sumodd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sumeven+=arr[i];
            }
            else sumodd+=arr[i];
        }
        System.out.println(sumeven);
        System.out.println(sumodd);

    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};

        sumEvenOdd(arr);
    }
}
