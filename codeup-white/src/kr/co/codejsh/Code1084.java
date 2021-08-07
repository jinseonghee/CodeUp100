package kr.co.codejsh;

import java.util.Scanner;

public class Code1084 {

    public static void main(String[] args) {

        String inputData[] = new Scanner(System.in).nextLine().split(" ");

        int r = Integer.parseInt(inputData[0]);
        int g = Integer.parseInt(inputData[1]);
        int b = Integer.parseInt(inputData[2]);
        int count = 0;

        for(int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                for(int k= 0; k < b; k++) {
                    System.out.printf("%d %d %d \n" , i, j ,k);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
