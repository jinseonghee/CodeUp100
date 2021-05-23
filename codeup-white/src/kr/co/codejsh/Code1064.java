package kr.co.codejsh;

import java.util.Scanner;

public class Code1064 {

    public static void main(String[] args) {

        String inputData[] = new Scanner(System.in).nextLine().split(" ");

        Long a = Long.parseLong(inputData[0]);
        Long b = Long.parseLong(inputData[1]);
        Long c = Long.parseLong(inputData[2]);

        System.out.printf("%d\n", a > b ? b > c ? c : b : a > c ? c : a);
    }
}
