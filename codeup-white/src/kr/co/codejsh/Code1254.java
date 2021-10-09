package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code1254 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        char a = line.charAt(0);
        char b = line.charAt(2);

        for (char i=a; i<=b; i++) {
            sb.append(i+" ");
        }
        System.out.println(sb);
    }
}
