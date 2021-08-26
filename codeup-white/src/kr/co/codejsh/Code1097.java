package kr.co.codejsh;

import java.util.Scanner;

public class Code1097 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] location = new int[19][19];
        for (int i=0; i<19; i++) {
            for (int j=0; j<19; j++) {
                location[i][j] = scan.nextInt();
            }
        }

        int n = scan.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i=0; i<n; i++) {
            x[i] = scan.nextInt()-1;
            y[i] = scan.nextInt()-1;
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<19; j++) {
                if(location[x[i]][j]==0) {
                    location[x[i]][j] = 1;
                } else {
                    location[x[i]][j] = 0;
                }

                if(location[j][y[i]]==0) {
                    location[j][y[i]] = 1;
                } else {
                    location[j][y[i]] = 0;
                }
            }
        }

        for (int i=0; i<location.length; i++) {
            for (int j=0; j<location.length; j++) {
                System.out.print(location[i][j] + " ");
            }
            System.out.println();
        }
    }
}
