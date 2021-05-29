package kr.co.codejsh;

import java.util.Scanner;

public class Code1067 {

    public static void main(String[] args) {

        int inputData = new Scanner(System.in).nextInt();

        MinusOrPlus(inputData);
        EvenOrOdd(inputData);
    }

    public static void MinusOrPlus(int num) {
        if (num < 0)
            System.out.println("minus");
        else
            System.out.println("plus");
    }

    public static void EvenOrOdd(int num) {
        if (num % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}

