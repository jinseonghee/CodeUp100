package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1171 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        sb.append(st.nextToken());
        String classes = st.nextToken();
        String number = st.nextToken();

        if (classes.length() < 2) {
            sb.append("0" + classes);
        } else {
            sb.append(classes);
        }

        if (number.length() < 3) {
            for (int i = 0; i < 3 - number.length(); i++) {
                sb.append("0");
            }
        }
        sb.append(number);
        System.out.print(sb);
    }
}

