package kr.co.codejsh;

import java.util.Scanner;

public class Code1076 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char a = sc.nextLine().charAt(0); //아스키코드 변환
        int b = (int) a;

        for (int i = 97; i <= b; i++) {
            System.out.print((char) i + " ");
        }
    }
}

