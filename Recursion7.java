package com.avi;

public class Recursion7 {
    public static int calcpower(int x, int n ){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
//n is even
        if(n%2==0){
            return calcpower(x,n/2)*calcpower(x,n/2);

        }
        else //odd
        {
            System.out.println(x);
            return calcpower(x,n/2)*calcpower(x,n/2)*x;
        }
    }
    public static void main(String[]args){
        int ans =calcpower(2,5);
        System.out.println(ans);
    }
}
