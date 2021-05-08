package kr.co.codejsh;

import java.util.Scanner;

public class Code1029 {

    public static void main(String[] args) {
        double d = new Scanner(System.in).nextDouble();
        //String format 형식을 사용하면 c언어의 함수처럼 서식 문자열을 이용한 형식 문자열을 만들 수 있다.
        //이러한 서식 문자열 앞에 % 를 붙여 문자열 앞에 기술해 두면 그 위치에 변수의 값을 형식화 하여 넣을 수 있다.
        System.out.printf(String.format("%.11f" , d));
    }
}
