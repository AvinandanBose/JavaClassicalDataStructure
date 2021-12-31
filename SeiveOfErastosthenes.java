package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class SeiveOfErastosthenes {

    public static void main(String[]args) {
        System.out.println("Enter a range:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] isPrime = new boolean[n + 1];
        isPrime[0] = false;
        for (int i = 1; i < n; i++) {
            isPrime[i] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (isPrime[i - 1]) {
                System.out.println(i);
                for (int j = i * i; j <= n; j = j + i) {
                    isPrime[j - 1] = false;
                }
            }
        }
    }
}
