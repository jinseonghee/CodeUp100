package kr.co.codejsh;

import java.util.Scanner;

public class Code1042 {

    public static void main(String[] args) {
        String inputData[] = new Scanner(System.in).nextLine().split(" ");
        System.out.println(Long.parseLong(inputData[0]) / Long.parseLong(inputData[1]));
    }
}
