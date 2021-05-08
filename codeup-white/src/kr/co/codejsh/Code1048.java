package kr.co.codejsh;

import java.util.Scanner;

public class Code1048 {

    public static void main(String[] args) {
        String inputData[] = new Scanner(System.in).nextLine().split(" ");
        System.out.println(Integer.parseInt(inputData[0]) * (int) Math.pow(2, Integer.parseInt(inputData[1])));
    }
}
