package com.avi;

public class Recursion4 {
    public static int factorial(int n){
        if(n==1 || n==0){
            int t =1;
            System.out.println("Factorial of"+n+"="+t);
            return t;
        }

        int fact = n * factorial(n-1);
        System.out.println("Factorial of"+n+"="+fact);
        return fact;
    }
    public static void main(String[]args){
        int ans = factorial(10);
        System.out.println("Our ans ="+ans);
    }
}
