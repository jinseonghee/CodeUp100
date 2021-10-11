package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code1256 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int starCount = Integer.parseInt(br.readLine());

        for (int i=0; i<starCount; i++) {
            sb.append("*");
        }
        System.out.println(sb);
    }
}