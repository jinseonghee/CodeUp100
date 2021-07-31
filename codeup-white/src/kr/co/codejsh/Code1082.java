package kr.co.codejsh;

import java.util.Scanner;

public class Code1082 {

    public static void main(String[] args) {

        String inputData[] = new Scanner(System.in).nextLine().split("\n");
        int n = Integer.parseInt(inputData[0],16);

        for(int i = 1; i < 16; i++) {
            System.out.format("%X*%X=%X\n", n, i, n*i);
        }
    }
}
