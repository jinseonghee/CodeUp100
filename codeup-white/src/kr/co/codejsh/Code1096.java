package kr.co.codejsh;

import java.util.Scanner;

public class Code1096 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int stone = scan.nextInt();

        int[][] location = new int[19][19];
        for (int i=0; i<stone; i++) {
            int x = scan.nextInt()-1;
            int y = scan.nextInt()-1;

            location[x][y] = 1;
        }

        for (int i=0; i<location.length; i++) {
            for (int j=0; j<location.length; j++) {
                System.out.print(location[i][j] + " ");
            }
            System.out.println();
        }
    }
}

