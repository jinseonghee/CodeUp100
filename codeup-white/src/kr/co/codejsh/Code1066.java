package kr.co.codejsh;

import java.util.Scanner;

public class Code1066 {

    public static void main(String[] args) {

        String inputData[] = new Scanner(System.in).nextLine().split(" ");

        for (String el : inputData) {  //foreach 사용하기
            if (Integer.parseInt(el) % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
/*

  ex) for (type var : iterate) {
    body-of-loop
}
루프를 돌릴 객체를 iterate부분에 넣어주고 각 루프에서 나오는 타입과 {} 안에서 사용할 변수명을 var에 지정해 주면 된다.
iterate부분에 들어가는 타입은 당연히 루프를 돌릴수 있는 형태인 Array나 Collections가 가능하고 Iterable<E>를 상속받은 객체또한 가능하다.

*/



