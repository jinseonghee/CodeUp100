package kr.co.codejsh;

import java.util.Scanner;

public class Code1031 {
    public static void main(String[] args) {

        /*
        System.out.println("십진수를 입력하세요 : ");
        String a = new Scanner(System.in).next();

        a = Integer.toOctalString('a');
        System.out.println(a);
        */
         System.out.println("십진수를 입력하세요 : ");
         int a = new Scanner(System.in).nextInt();

         System.out.printf("%o" ,a);
    }
}
