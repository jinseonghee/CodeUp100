package kr.co.codejsh;

import java.util.Scanner;

public class Code1039 {

    public static void main(String[] args) {
        String[] str = new Scanner(System.in).nextLine().split(" ");
        System.out.println("sum : " + (Long.parseLong(str[0]) + Long.parseLong(str[1])));
    }
}
