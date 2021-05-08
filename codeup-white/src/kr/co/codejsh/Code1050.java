package kr.co.codejsh;

import java.util.Scanner;

public class Code1050 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long inputData[] = new long[2];
        inputData[0] = scan.nextLong();
        inputData[1] = scan.nextLong();

        System.out.println(getResultByInputValues(inputData));
    }

    private static long getResultByInputValues(long[] inputData) {
        if (isCompareToTemp(inputData))
            return 1L;
        return 0L;
    }

    private static boolean isCompareToTemp(long[] inputData) {
        return inputData[0] == inputData[1];
    }
}
