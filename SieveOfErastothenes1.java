package com.company;
import java.lang.Math;
import java.util.Scanner;
public class SieveOfErastothenes1 {
    public static void checkPrime(int num){
        boolean prime[]= new boolean[num+1];
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i<=num;i++){
            prime[i]=true;
        }
        for(int p =2;p<=Math.floor(Math.sqrt(num));p++)//Math.Floor not necessary
        {
            if(prime[p]){
                for(int j=p;j*p<=num;j++){
                    prime[j*p]=false;
                }
            }
        }
        for(int i =0;i<num;i++){
            if(prime[i]){
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range:");
        int n = sc.nextInt();
        System.out.println("Prime number upto range:"+n+" under SieveOfErastothenes method:");
        checkPrime(n);
    }

}
