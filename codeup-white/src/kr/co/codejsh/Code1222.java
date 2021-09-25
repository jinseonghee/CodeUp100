package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1222 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int time = Integer.parseInt(st.nextToken());
        int goal1 = Integer.parseInt(st.nextToken());
        int goal2 = Integer.parseInt(st.nextToken());

        int addGoal = 0;

        if ((90-time)%5==0) {
            addGoal = (90-time)/5;
        } else {
            addGoal = (90-time)/5+1;
        }

        sb.append(addGoal>(goal2-goal1) ? "win" : addGoal<(goal2-goal1) ? "lose" : "same");

        System.out.println(sb);
        br.close();
    }
}

