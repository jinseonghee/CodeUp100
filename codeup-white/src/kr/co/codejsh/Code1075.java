package kr.co.codejsh;

import java.util.Scanner;

public class Code1075 {

    public static void main(String[] args) {

        int inputData = new Scanner(System.in).nextInt();

        if(inputData >= 1 && inputData <= 100){
            for (int i = inputData-1; i >= 0; i--) {
                System.out.println(i);
            }
        }
    }
}

