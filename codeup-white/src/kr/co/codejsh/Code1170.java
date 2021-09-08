package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1170 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        // 순서대로 입력 될 학년, 반을 바로 더해준다.
        sb.append(st.nextToken()).append(st.nextToken());

        String number = st.nextToken();
        if (number.length() >= 2) {	// 번호의 String 타입이 두자리 이상이면
            sb.append(number);
        } else {	// 번호가 10 미만이면
            sb.append("0" + number);
        }
        System.out.print(sb);
    }
}

