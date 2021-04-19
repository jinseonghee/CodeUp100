package kr.co.codejsh;

import java.util.Scanner;

public class Code1024 {

    public static void main(String[] args) {

        String temp = new Scanner(System.in).next(); //scanner는 입력받을때 string 타입으로 밖에 받을 수 없다.

        for(int i=0; i<temp.length();i++){ //char 타입은 기본형으 글자 하나만 저장할 수 있는 변수
            char arr = temp.charAt(i); //charAt은 String 으로 저장된 문자열 중에서 한 글자만 선택해서 char 타입으로 변환해 준다.
            System.out.println("'"+arr+"'");
        }

    }
}
