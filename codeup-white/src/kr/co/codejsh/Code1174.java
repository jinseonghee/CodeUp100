package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1174 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int hour = Integer.parseInt(st.nextToken());
        int minutes = Integer.parseInt(st.nextToken());

        int total = (hour + 24) * 60 + minutes;
        total -= 30;

        hour = (total / 60) % 24;
        minutes = total % 60;

        sb.append(hour).append(" ").append(minutes);
        System.out.print(sb);
    }
}

