package kr.co.codejsh;

import java.util.Scanner;

public class Code1078 {

    public static void main(String[] args) {
        int inputData = new Scanner(System.in).nextInt();
        int sum = 0;

        for (int i = 0; i < inputData; i++) {
            if (i % 2 == 0)
                sum += i;
        }
        System.out.println("짝수의 합은 : " + sum);
    }
}

