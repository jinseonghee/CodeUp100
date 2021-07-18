package kr.co.codejsh;

import java.util.Scanner;

public class Code1080 {

    public static void main(String[] args) {

        int inputData = new Scanner(System.in).nextInt();
        int i = 0;
        int sum = 0;

        for (i = 0; sum < inputData; i++) {
            sum = sum + i;
        }
        System.out.println(i-1);
    }
}
