package kr.co.codejsh;

import java.util.Scanner;

public class Code1035 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String x = scan.nextLine();
        int y = Integer.valueOf(x, 16);
        System.out.printf("%d\n", y);
    }
}
