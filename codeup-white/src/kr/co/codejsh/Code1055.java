package kr.co.codejsh;

import java.util.Scanner;

public class Code1055 {

    public static void main(String[] args) {

        String inputData[] = new Scanner(System.in).nextLine().split(" ");
        System.out.println(getResultValue(inputData));
    }

    public static String getResultValue(String[] inputData) {
        if (isCompareToVatlue(inputData))
            return "1";
        return "0";
    }

    public static boolean isCompareToVatlue(String[] inputData) {
        return (inputData[0].equals("1") || inputData[1].equals("1"));
    }
}