package kr.co.codejsh;

import java.util.Scanner;

public class Code1086 {

    public static void main(String[] args) {

        String inputData[] = new Scanner(System.in).nextLine().split(" ");

        long w = Long.parseLong(inputData[0]);
        long h = Long.parseLong(inputData[1]);
        long b = Long.parseLong(inputData[2]);

        double space = (w*h*b)/8/Math.pow(2,10)/Math.pow(2,10);
        System.out.printf("%.2f MB", space);
    }
}
