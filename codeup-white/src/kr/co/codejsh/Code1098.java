package kr.co.codejsh;

import java.util.Scanner;

public class Code1098 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int h = scan.nextInt();

        int[][] board = new int[w][h];

        int n = scan.nextInt();
        int[] i = new int[n];
        int[] d = new int[n];
        int[] x = new int[n];
        int[] y = new int[n];

        for (int j=0; j<n; j++) {
            i[j] = scan.nextInt();
            d[j] = scan.nextInt();
            x[j] = scan.nextInt()-1;
            y[j] = scan.nextInt()-1;
        }

        for (int j=0; j<n; j++) {
            for (int k=0; k<i[j]; k++) {
                if (d[j]==0) {
                    board[x[j]][y[j]+k] = 1;
                } else {
                    board[x[j]+k][y[j]] = 1;
                }
            }
        }

        for (int j=0; j<w; j++) {
            for (int k=0; k<h; k++) {
                System.out.print(board[j][k] + " ");
            }
            System.out.println();
        }
    }
}

