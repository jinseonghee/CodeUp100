package kr.co.codejsh;

import java.util.Arrays;
import java.util.Scanner;

public class Code1095 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] inputData = new int[scan.nextInt()];

        for (int i=0; i<inputData.length; i++) {
            inputData[i] = scan.nextInt();
        }

        Arrays.sort(inputData);
        System.out.print(inputData[0]);
    }
}

