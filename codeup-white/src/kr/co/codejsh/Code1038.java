package kr.co.codejsh;

import java.util.Scanner;

public class Code1038 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int sum = a + b;
        System.out.println("sum : " + sum);

        /*String[] split = new Scanner(System.in).nextLine().split(" ");
        System.out.println("sum : " + (Integer.parseInt(split[0]) + Integer.parseInt(split[1])));*/
    }
}
