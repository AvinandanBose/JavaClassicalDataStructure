package com.company;
import java.util.Scanner;
public class SeiveOfErastosthenes {

    public static void main(String[]args) {
        System.out.println("Enter a range:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]==true) {
                System.out.println(i);
                for (int j = i * i; j <= n; j=j +i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
