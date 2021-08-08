package kr.co.codejsh;

import java.util.Scanner;

public class Code1085 {

    public static void main(String[] args) {

        String inputData[] = new Scanner(System.in).nextLine().split(" ");

        long h = Long.parseLong(inputData[0]);
        long b = Long.parseLong(inputData[1]);
        long c = Long.parseLong(inputData[2]);
        long s = Long.parseLong(inputData[3]);

        float space = (float) (((h*b*c*s)/8)/Math.pow(2,10)/Math.pow(2,10));

        System.out.printf("%.1f MB", space);
    }
}
