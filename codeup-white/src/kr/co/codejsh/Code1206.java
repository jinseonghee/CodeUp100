package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1206 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a%b==0) {
            int x = a/b;
            sb.append(b).append("*").append(x).append("=").append(a);
        } else if (b%a==0) {
            int x = b/a;
            sb.append(a).append("*").append(x).append("=").append(b);
        } else {
            sb.append("none");
        }
        System.out.print(sb);
        br.close();
    }
}
