package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1255 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());

        for (double i=a; i<=b; i+=0.01) {
            sb.append(String.format("%.2f", i)+" ");
        }

        System.out.print(sb);
    }
}

