package kr.co.codejsh;

import java.util.Scanner;

public class Code1025 {
    public static void main(String[] args) {

        String a = new Scanner(System.in).next();

        char[] arr = a.toCharArray();
        for(int i=0; i<arr.length; i++){
            System.out.printf("["+arr[i]);
            for(int j=arr.length-1; j>i; j--){
                System.out.printf("0");
            }
            System.out.printf("]");
        }
        //toCharArray는 string을 char[]로 return?

        }
    }

