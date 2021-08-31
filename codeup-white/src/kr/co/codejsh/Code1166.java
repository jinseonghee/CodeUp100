package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code1166 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        System.out.print( (year%4==0 && year%100!=0) || (year%400==0) ? "yes" : "no" );
    }
}
