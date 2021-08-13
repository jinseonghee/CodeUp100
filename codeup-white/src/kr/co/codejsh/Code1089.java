package kr.co.codejsh;

import java.util.Scanner;

public class Code1089 {

    public static void main(String[] args) {

        String inputData[] = new Scanner(System.in).nextLine().split(" ");

        int a = Integer.parseInt(inputData[0]);
        int d = Integer.parseInt(inputData[1]);
        int n = Integer.parseInt(inputData[2]);

        a += d * (n - 1);
        System.out.println(a);
    }
}
