package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1230 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a<=170) {
            sb.append("CRASH ").append(a);
        } else if (b<=170) {
            sb.append("CRASH ").append(b);
        } else if (c<=170) {
            sb.append("CRASH ").append(c);
        } else {
            sb.append("PASS");	
        }

        System.out.print(sb);
        br.close();
    }
}

