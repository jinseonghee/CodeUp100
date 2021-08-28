package kr.co.codejsh;

import java.util.Scanner;

public class Code1099 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] maze = new int[10][10];
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {

                maze[i][j] = scan.nextInt();
            }
        }

        int position = 1;

        for (int j=1; j<10; j++) {

            if (maze[position][j]==2 || (position==8 && j==8)) {
                maze[position][j] = 9;
                break;
            } else {
                maze[position][j] = 9;
                if (maze[position][j+1]==1) {
                    position += 1;
                    j -= 1;
                }
            }
        }

        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}
