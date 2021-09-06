package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code1169 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int age = Integer.parseInt(br.readLine());
        int now = 2012;

        int bornYear = now - (age-1);

        sb.append(bornYear%100).append(" ");

        if (age>13) {
            sb.append("1");
        } else {
            sb.append("3");
        }
        System.out.print(sb);
    }
}
