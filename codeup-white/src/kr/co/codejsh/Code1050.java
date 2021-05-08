package kr.co.codejsh;

import java.util.Scanner;

public class Code1050 {

    public static void main(String[] args) {
        String temp[] = new Scanner(System.in).nextLine().split(" ");
        System.out.println(getResultByInputValues(temp));
    }

    private static String getResultByInputValues(String[] temp) {
        if (isCompareToTemp(temp))
            return "1";
        return "0";
    }

    private static boolean isCompareToTemp(String[] temp) {
        return temp[0].equals(temp[1]);
    }
}
