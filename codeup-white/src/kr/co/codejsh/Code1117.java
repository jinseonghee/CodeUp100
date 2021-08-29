package kr.co.codejsh;

import java.util.Scanner;

public class Code1117 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Double number1 = scan.nextDouble();
        Double number2 = scan.nextDouble();

        Double multiple = number1*number2;

        multiple = (double)Math.round(multiple*100);
        multiple /= 100;

        System.out.println(multiple);
    }
}
