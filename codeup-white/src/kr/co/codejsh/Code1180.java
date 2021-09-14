package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code1180 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        int tens = 0;
        int units =0;

        if (n.length()==1) {
            units = n.charAt(0)-'0';
        } else {
            tens = n.charAt(0)-'0';
            units = n.charAt(1)-'0';
        }

        int result = (units*10+tens)*2%100;
        System.out.println(result);
        System.out.println(result<=50 ? "GOOD" : "OH MY GOD");
    }
}

