package kr.co.codejsh;

import java.util.Scanner;

public class Code1081 {

    public static void main(String[] args) {

        String inputData[] = new Scanner(System.in).nextLine().split(" ");

        int n = Integer.parseInt(inputData[0]);
        int m = Integer.parseInt(inputData[1]);

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
