package kr.co.codejsh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Code1079 {

    public static void main(String[] args) {
        
        String inputData[] = new Scanner(System.in).nextLine().split(" ");

        for (String el : inputData) {
            System.out.println(el);
            if(el.equals("q")) {
                break;
            }
        }
    }
}
