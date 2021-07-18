package kr.co.codejsh;

import java.util.Scanner;

public class Code1080 {

    public static void main(String[] args) {

        int inputData = new Scanner(System.in).nextInt();
        int sum = 0;

        for(int i = 1; i < inputData; i++) {
            sum += i;
            /*if (!(sum < inputData)) {
                System.out.println(i);
                break;
            }*/

            if (sum >= inputData) {
                System.out.println(i);
                break;
            }
        }
    }
}
