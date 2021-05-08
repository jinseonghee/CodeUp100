package kr.co.codejsh;

import java.util.Scanner;

public class Code1020 {

    public static void main(String[] args) {
        String temp[] = new Scanner(System.in).nextLine().split("-");
        System.out.println(temp[0] + temp[1]);

        if (temp.length != 2) System.out.println("입력한 값을 다시 확인해주세요");
    }
}
