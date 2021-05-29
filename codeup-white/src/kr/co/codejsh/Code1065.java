package kr.co.codejsh;

import java.util.Scanner;

public class Code1065 {

    public static void main(String[] args) {

        String inputData[] = new Scanner(System.in).nextLine().split(" ");

        int a = Integer.parseInt(inputData[0]);
        int b = Integer.parseInt(inputData[1]);
        int c = Integer.parseInt(inputData[2]);

        if (a % 2 == 0) {
            System.out.printf("%d\n", a);
        }
        if (b % 2 == 0) {
            System.out.printf("%d\n", b);
        }
        if (c % 2 == 0) {
            System.out.printf("%d\n", c);
        }
    }
}

