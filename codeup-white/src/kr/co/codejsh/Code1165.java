package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1165 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lestTime = 90 - Integer.parseInt(st.nextToken());
        int currentGoalScore = Integer.parseInt(st.nextToken());

        if (lestTime % 5 == 0) {
            currentGoalScore += lestTime / 5;
        } else {
            currentGoalScore += lestTime / 5 + 1;
        }
        System.out.print(currentGoalScore);
    }
}
