package kr.co.codejsh;

import java.util.Scanner;

public class Code1068 {

    public static void main(String[] args) {

        int inputData = new Scanner(System.in).nextInt();

        if(inputData >= 90 && inputData <= 100){
            System.out.println("A");
        } else if (inputData >= 70 && inputData <= 89) {
            System.out.println("B");
        } else if (inputData >= 40 && inputData <= 69) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}

