package kr.co.codejsh;

import java.util.Scanner;

public class Code1019 {

    public static void main(String[] args) {
        String temp[] = new Scanner(System.in).nextLine().split("\\.");
        System.out.println(temp[0] + ".0" + temp[1] + ".0" + temp[2]);
    }
}
