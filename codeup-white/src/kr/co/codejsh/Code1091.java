package kr.co.codejsh;

import java.util.Scanner;

public class Code1091 {

    public static void main(String[] args) {

        String inputData[] = new Scanner(System.in).nextLine().split(" ");

        int a = Integer.parseInt(inputData[0]);
        int m = Integer.parseInt(inputData[1]);
        int d = Integer.parseInt(inputData[2]);
        int n = Integer.parseInt(inputData[3]);

        for(int i = 1; i < n; i++) {
            a = a * m + d;
        }
        System.out.println(a);
    }
}
