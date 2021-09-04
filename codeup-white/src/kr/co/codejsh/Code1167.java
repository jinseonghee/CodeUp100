package kr.co.codejsh;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code1167 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] number = new int[3];
        for (int i=0; i<3; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(number);

        bw.append(String.valueOf(number[1]));
        bw.flush();
        br.close();
        bw.close();
    }
}
