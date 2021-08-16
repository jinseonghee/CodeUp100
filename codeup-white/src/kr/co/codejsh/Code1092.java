package kr.co.codejsh;

import java.util.Scanner;

public class Code1092 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int three = scanner.nextInt();
        boolean find = true;

        int day = 1;
        while (day % first != 0 || day % second != 0 || day % three != 0) {
            day++;
            if (day >= (Integer.MAX_VALUE)) {
                find = false;
                break;
            }
        }

        if (find) {
            System.out.println(day);
        }
    }
}

