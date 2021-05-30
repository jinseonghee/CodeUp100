package kr.co.codejsh;

import java.util.Scanner;

public class Code1071 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            int inputData = scan.nextInt();

            if (inputData == 0)
                break;
            System.out.println(inputData);
        }
    }
}