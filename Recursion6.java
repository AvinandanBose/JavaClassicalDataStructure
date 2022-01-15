package com.avi;

public class Recursion6 {
    public static int calcpower(int x, int n ){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        int xpower =  x*calcpower(x,n-1);
        return xpower;
    }
    public static void main(String[]args){
        int ans = calcpower(20,2);
        System.out.print(ans);
    }
}
