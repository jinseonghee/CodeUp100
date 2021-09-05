package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1168 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int frontNo = Integer.parseInt(st.nextToken());
        int backNo = Integer.parseInt(st.nextToken());

        int now = 2012;
        int age = 0;

        if (backNo == 1 || backNo == 2) {
            frontNo = frontNo / 10000 + 1900;
        } else {
            frontNo = frontNo / 10000 + 2000;
        }
        age = now - frontNo + 1;
        System.out.print(age);
    }
}

