package kr.co.codejsh;

import java.util.Scanner;

public class Code1073 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();

            if (num == 0) {
                System.out.println(num);
                break;
            }
            System.out.println(num);
        }
    }
}

