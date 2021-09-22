package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1216 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int adIncome1 = Integer.parseInt(st.nextToken());
        int adIncome2 = Integer.parseInt(st.nextToken());
        int adCost = Integer.parseInt(st.nextToken());

        int result = adIncome1 - (adIncome2-adCost);

        sb.append(result>0 ? "do not advertise" : result<0 ? "advertise" : "does not matter");

        System.out.println(sb);
        br.close();
    }
}

