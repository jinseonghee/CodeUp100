package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1228 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        double height = Double.parseDouble(st.nextToken());
        double weight = Double.parseDouble(st.nextToken());

        double stanWeight = (height-100) * 0.9;

        double bmi = (weight-stanWeight) * 100 / stanWeight;

        if (bmi<=10) {
            sb.append("정상");
        } else if(bmi<=20) {
            sb.append("과체중");
        } else {
            sb.append("비만");
        }

        System.out.println(sb);
        br.close();
    }
}

