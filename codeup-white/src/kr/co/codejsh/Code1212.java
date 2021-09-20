package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1212 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        boolean yesno = false;

        if (a > b) {
            if (a > c) {
                if (a < b + c) {
                    yesno = true;
                }
            } else {
                if (c < a + b) {
                    yesno = true;
                }
            }
        } else {
            if (b > c) {
                if (b < a + c) {
                    yesno = true;
                }
            } else {
                if (c < a + b) {
                    yesno = true;
                }
            }
        }

        System.out.println(yesno ? "yes" : "no");
    }
}

