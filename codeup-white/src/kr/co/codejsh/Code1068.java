package kr.co.codejsh;

import java.util.Scanner;

public class Code1068 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수입력 : ");
        int a = sc.nextInt();

        if(a>=90&&a<=100) {
            System.out.print("A");
        }else if(a>=70&&a<=89) {
            System.out.print("B");
        }else if(a>=40&&a<=69) {
            System.out.print("C");
        }else {
            System.out.print("D");
        }
    }
}

