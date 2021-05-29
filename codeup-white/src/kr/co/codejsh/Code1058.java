package kr.co.codejsh;

import java.util.Scanner;

public class Code1058 {

    public static void main(String[] args) {

        String inputData[] = new Scanner(System.in).nextLine().split(" ");

        if (inputData[0].equals(0) && inputData[1].equals(1)) {
            System.out.println(1);
        } else
            System.out.println(0);
    }
}


        /*
        Scanner scan = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a==0) && (b==0))
            System.out.println(1);
        else
            System.out.println(0);

    }

         */

