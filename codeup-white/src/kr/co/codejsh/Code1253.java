package kr.co.codejsh;

import java.io.*;
import java.util.StringTokenizer;

public class Code1253 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int add =1;
        if (A==B) {	
            bw.append(String.valueOf(A));
        } else if (A>B) {
            bw.append(String.valueOf(B)+" ");
            for (int i=1; i<A-B; i++) {
                bw.append(String.valueOf(B+add)+" ");
                add++;
            }
            bw.append(String.valueOf(A));
        } else {
            bw.append(String.valueOf(A)+" ");
            for (int i=1; i<B-A; i++) {
                bw.append(String.valueOf(A+add)+" ");
                add++;
            }
            bw.append(String.valueOf(B));
        }

        bw.flush();
        bw.close();
    }
}

