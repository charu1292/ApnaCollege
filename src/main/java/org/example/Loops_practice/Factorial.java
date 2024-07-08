package org.example.Loops_practice;
//Write a program to find the factorialof any number entered by the user.
// (Hint:factorialofanumbern=n*(n-1)*(n-2)*(n-3)*......*1andexistsforpositivenumbersonly.
// We write factorial as n!So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.Note -
// Please do not confuse factorial with NOT EQUAL TO operator, they are not the same

import java.util.Scanner;

public class Factorial {

    public static int fact(int n) {
     if(n==1){
             return 1;
     }
     else return n*fact (n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}
