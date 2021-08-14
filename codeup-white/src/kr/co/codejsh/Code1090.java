package kr.co.codejsh;

import java.util.Scanner;

public class Code1090 {

    public static void main(String[] args) {

        String inputData[] = new Scanner(System.in).nextLine().split(" ");

        int a = Integer.parseInt(inputData[0]);
        int r = Integer.parseInt(inputData[1]);
        int n = Integer.parseInt(inputData[2]);

        a *= Math.pow(r, (n-1));
        System.out.println(a);
    }
}
