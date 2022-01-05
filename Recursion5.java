package com.avi;

public class Recursion5 {
 public static int fibonacci(int a , int b, int n){
     if(n==0|| n==1){
         return 0; //just for base case to get false
     }

     int c = a+b;
     System.out.println(c);
     return fibonacci(b,c,n-1);

 }
 public static void main(String[]args){
     int a = 0;
     int b = 1;
     System.out.println(a+"\n"+b);
      fibonacci(0,1,10);
 }
}
