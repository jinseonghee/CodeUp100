package kr.co.codejsh;

import java.util.Scanner;

public class Code1026 {

    public static void main(String[] args) {
        System.out.println("시분초를 입력하세요");

        String[] temp = new Scanner(System.in).nextLine().split("\\:");

        if (temp.length == 3)
            System.out.println(temp[1]);
    }
}
