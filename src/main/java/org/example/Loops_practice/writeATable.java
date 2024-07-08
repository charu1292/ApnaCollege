package org.example.Loops_practice;

import java.util.Scanner;

public class writeATable {

    public static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" ="+ i * n);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for a table :");
        int n =sc.nextInt();
        System.out.println("Here is your table:");
        table(n);
    }
}
