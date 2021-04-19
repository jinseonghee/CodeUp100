package kr.co.codejsh;

import java.util.Scanner;

public class Code1010 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("숫자를 입력 하세요 : ");
        int i=scan.nextInt();
        System.out.println(i);
        //리패토링
        System.out.println(new Scanner(System.in).nextLine());
        //변수의 쓰임이 한번에 끝나는 문제였기 때문에 객체생성해서 scan이라는 변수에 담을 필요가 없이 바로 객체를 생성해서
        //수를 입력 받으면 된다.
    }
}
