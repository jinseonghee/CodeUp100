package kr.co.codejsh;

import java.util.Scanner;

public class Code1043 {

    public static void main(String[] args) {

        String temp[] = new Scanner(System.in).nextLine().split(" ");

        System.out.println(Long.parseLong(temp[0])%Long.parseLong(temp[1]));

    }
}
