package kr.co.codejsh;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Code1048 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nums = sc.nextLine();

        StringTokenizer st = new StringTokenizer(nums," ");

        String arr[] = new String[2];

        int i=0;
        while(st.hasMoreTokens()) {
            arr[i]=st.nextToken();
            i+=1;
        }

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        System.out.println(a<<b);

    }
}
