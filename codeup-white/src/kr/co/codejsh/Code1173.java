package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1173 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int hour = Integer.parseInt(st.nextToken());
        int minutes = Integer.parseInt(st.nextToken());

        if (hour != 0) {
            if (minutes >= 30) {
                sb.append(hour+" ").append(minutes-30);
            } else {
                sb.append(hour-1+" ").append(minutes+30);
            }
        } else {
            if (minutes >= 30) {
                sb.append(hour+" ").append(minutes-30);
            } else {
                sb.append(23+" ").append(minutes+30);
            }
        }
        System.out.print(sb);
    }
}

