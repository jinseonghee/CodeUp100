package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code1204 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int number = Integer.parseInt(br.readLine());

        if (number/10 == 1) {
            sb.append(number+"th");
        } else {
            switch (number%10) {
                case 1 : sb.append(number+"st"); break;
                case 2 : sb.append(number+"nd"); break;
                case 3 : sb.append(number+"rd"); break;
                default: sb.append(number+"th");
            }
        }

        System.out.print(sb);
    }
}


