package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1210 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int total = 0;

        for (int i=0; i<2; i++) {
            // 메뉴의 칼로리에 맞게 계산
            switch (st.nextToken()) {
                case "1" : total+=400; break;
                case "2" : total+=340; break;
                case "3" : total+=170; break;
                case "4" : total+=100; break;
                default: total+=70; break;
            }
        }
        System.out.print(total>500? "angry":"no angry");
        br.close();
    }
}

