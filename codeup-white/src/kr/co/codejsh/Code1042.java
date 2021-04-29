package kr.co.codejsh;

import java.util.Scanner;

public class Code1042 {

    public static void main(String[] args) {

        String temp[] = new Scanner(System.in).nextLine().split(" ");
        long x = Long.parseLong(temp[0]);
        long y = Long.parseLong(temp[1]);
        System.out.println(x/y);
    }

}
