package kr.co.codejsh;

import java.util.Scanner;

public class Code1087 {

    public static void main(String[] args) {

        int inputData = new Scanner(System.in).nextInt();
        long sum = 0;

        for(int i = 1; ; i++) {
            sum += i;
            if(sum  >= inputData) {
                break;
            }
        }
        System.out.println(sum);
    }
}

