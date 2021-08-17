package kr.co.codejsh;

import java.util.Scanner;

public class Code1093 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[24];

        for (int i = 0; i < n; i++) {
            int t = scan.nextInt();
            a[t] += 1;
        }

        for(int i = 1; i <= 23; i ++) {
            System.out.print(a[i] + " ");
        }
    }
}

