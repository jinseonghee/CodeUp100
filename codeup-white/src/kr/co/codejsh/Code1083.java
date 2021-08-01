package kr.co.codejsh;

import java.util.Scanner;

public class Code1083 {

    public static void main(String[] args) {

        int inputData = new Scanner(System.in).nextInt();

        if (inputData > 0 && inputData < 10) {
            String[] s = new String[inputData];
            for (int i = 1; i <= inputData; i++) {
                String x = i + "";
                if (x.equals("3") || x.equals("6") || x.equals("9")) {
                    System.out.print("X ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}