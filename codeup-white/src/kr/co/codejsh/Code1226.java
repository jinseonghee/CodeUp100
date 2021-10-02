package kr.co.codejsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1226 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(str1, " ");
        StringTokenizer st2 = new StringTokenizer(str2, " ");

        int[] lottoNo = new int[7];
        int[] myNo = new int[6];

        for (int i=0; i<6; i++) {
            lottoNo[i] = Integer.parseInt(st1.nextToken());
            myNo[i] = Integer.parseInt(st2.nextToken());
        }
        lottoNo[6] = Integer.parseInt(st1.nextToken());

        int count = 0;
        int bonus = 0;

        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                if (lottoNo[i] == myNo[j]) {
                    count++;
                }
                if (lottoNo[6] == myNo[j]) {
                    bonus++;
                }
            }
        }

        if (bonus==0) {
            if (count<=2) {
                System.out.println(0);
            } else if (count==3) {
                System.out.println(5);
            } else if (count==4) {
                System.out.println(4);
            } else if (count==5) {
                System.out.println(3);
            } else if (count==6){
                System.out.println(1);
            }
        } else {
            if (count<=2) {
                System.out.println(0);
            } else if (count==3) {
                System.out.println(5);
            } else if (count==4) {
                System.out.println(4);
            } else if (count==5) {
                System.out.println(2);
            } else if (count==6){
                System.out.println(1);
            }
        }
    }
}

