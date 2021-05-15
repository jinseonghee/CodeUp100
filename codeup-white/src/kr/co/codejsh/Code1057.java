package kr.co.codejsh;

import java.util.Scanner;

public class Code1057 {

    public static void main(String[] args) {

        String inputData[] = new Scanner(System.in).nextLine().split(" ");
        System.out.println(getResultValue(inputData));
    }

    public static String getResultValue(String[] inputData) {
        if(isCompareToValue(inputData))
            return "1";
        return "0";
    }

    public static boolean isCompareToValue(String[] inputData) {
        return inputData[0].equals(inputData[1]);
    }
}
