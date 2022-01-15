package com.avi;

public class Recursion8TOH {
    public static void TowerOfHanoi(int n, String src,String helper, String destination){
        if(n==1){
            System.out.println("transfer disk"+n+"from"+src+"to"+destination);
            return;
        }
        TowerOfHanoi(n-1,src,destination,helper);
        System.out.println("transfer disk"+n+"from"+src+"to"+destination);
        TowerOfHanoi(n-1,helper, src,destination);
    }
    public static void main(String[]args){
        int n=3;
        TowerOfHanoi(n,"S","H","D");
    }
}
