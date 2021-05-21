package kr.co.codejsh;

import java.util.Scanner;

public class Code1063 {

    public static void main(String[] args) {

        String inputData[] = new Scanner(System.in).nextLine().split(" ");
        System.out.println(Long.parseLong(inputData[0]) > Long.parseLong(inputData[1]) ? inputData[0] : inputData[1]);
    }
}
