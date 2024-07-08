package org.example.Loops_practice;

import java.util.Scanner;

//we can run this the for loop to under root of n times that gives us a signification time
//difference when we compute for large set of data

public class isNumberPrime {

    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <=Math.sqrt(n); i++)
//                for (int i = 2; i <= n - 1; i++)
                {
                if (n % i == 0)
                    return false;

            }
            return true;
        }
    }


    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.printf("Enter your Number: ");
     int n=sc.nextInt();
        System.out.print(isprime(n));
    }
}
