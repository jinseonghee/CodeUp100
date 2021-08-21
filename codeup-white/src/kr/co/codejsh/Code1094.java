package kr.co.codejsh;

import java.util.Scanner;

public class Code1094 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] inputData = new int[scan.nextInt()];

        for (int i = 0; i < inputData.length; i++) {
            inputData[i] = scan.nextInt();
        }

        for (int i = inputData.length - 1; i >= 0; i--) {
            System.out.print(inputData[i] + " ");
        }
        scan.close();
    }
}
