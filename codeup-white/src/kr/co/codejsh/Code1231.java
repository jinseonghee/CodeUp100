package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1231 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        StringTokenizer st;

        if (str.indexOf('+') != -1) {
            st = new StringTokenizer(str, "+");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
        } else if (str.indexOf('-') != -1) {
            st = new StringTokenizer(str, "-");
            sb.append(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()));
        } else if (str.indexOf('*') != -1) {
            st = new StringTokenizer(str, "*");
            sb.append(Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
        } else {
            st = new StringTokenizer(str, "/");
            sb.append(String.format("%.2f", Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken())));    
        }

        System.out.println(sb);
        br.close();
    }
}
