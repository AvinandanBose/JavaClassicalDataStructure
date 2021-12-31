package com.company;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
public class sieveOfEratosthenes {
   static boolean[] Seive(int n){
       boolean[] isPrime = new boolean[n+1];

       Arrays.fill(isPrime,true);
       isPrime[0]=false;
       isPrime[1]=false;
       for(int i=2;i*i<=n;i++){
           for(int j=2*i;j<=n;j=j+i){
            isPrime[j]=false;
           }
       }

    return isPrime;
    }
    public static void main(String[]args){
        System.out.println("Enter a range:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime[]= Seive(n);
        for(int i=0;i<=n;i++)
        {
            System.out.println(i+" "+isPrime[i]);
        }


    }
}
