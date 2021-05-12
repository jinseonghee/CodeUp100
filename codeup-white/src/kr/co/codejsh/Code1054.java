package kr.co.codejsh;

import java.util.Scanner;

public class Code1054 {

    public static void main(String[] args) {
        String inputData[] = new Scanner(System.in).nextLine().split(" ");
        System.out.println(getResultValue(inputData));
    }

    public static String getResultValue(String[] inputData) {
        if (isCompareToValue(inputData))
            return "1";
        return "0";
    }

    public static boolean isCompareToValue(String[] inputData) {
        return inputData[0].equals(inputData[1]);
    }
}       /*
        System.out.println(System.identityHashCode(inputData[0]));
        System.out.println(System.identityHashCode(inputData[1]));
        참조 비교 ( 주소 비교 ) 에는 == 연산자를 사용 하고 내용 비교 에는 .equals () 메서드를 사용할 수 있습니다 .
        간단히 말해서 ==는 두 객체가 동일한 메모리 위치를 가리키는 지 확인하는 반면 .equals ()는 객체의 값 비교를 평가합니다.
        */


