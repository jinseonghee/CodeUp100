package kr.co.codejsh;

import java.util.Scanner;

public class Code1049 {
    public static void main(String[] args) {

        String temp[] = new Scanner(System.in).nextLine().split(" ");
        long result;

        if(Long.parseLong(temp[0])>Long.parseLong(temp[1])){
            System.out.println("1");
        }
        if((Long.parseLong(temp[0])<Long.parseLong(temp[1]))){
            System.out.println("0");
        }
    }
}
