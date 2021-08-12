package kr.co.codejsh;

import java.util.Scanner;

public class Code1088 {

    public static void main(String[] args) {

        int inputData = new Scanner(System.in).nextInt();

        for (int i = 1; i <= inputData; i++) {
            if (isMultipleOfThree(i))
                continue;
            System.out.print(i + " ");
        }
    }

    private static boolean isMultipleOfThree(int i) {
        return i % 3 == 0;
    }
}
