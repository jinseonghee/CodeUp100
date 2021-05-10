package kr.co.codejsh;

import java.util.Scanner;

public class Code1052 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long inputData[] = new long[2];

        inputData[0] = scan.nextLong();
        inputData[1] = scan.nextLong();

        System.out.println(getResultValue(inputData));
    }

    public static String getResultValue(long[] inputData) {
        if (isCompareToValue(inputData))
            return "1";
        return "0";
    }

    public static boolean isCompareToValue(long[] inputData) {
        return inputData[0] != inputData[1];
    }
}
