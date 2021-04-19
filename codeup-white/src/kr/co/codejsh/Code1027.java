package kr.co.codejsh;

import java.util.Scanner;

public class Code1027 {
    public static void main(String[] args) {

        String[] temp = new Scanner(System.in).next().split("\\.");

        if(temp.length == 3)
            System.out.println(temp[2] + "-" + temp[1] + "-" + temp[0]);
    }
}
