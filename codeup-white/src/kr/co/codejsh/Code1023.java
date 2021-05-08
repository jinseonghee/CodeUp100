package kr.co.codejsh;

import java.util.Arrays;
import java.util.Scanner;

public class Code1023 {

    public static void main(String[] args) {
        String[] temp = new Scanner(System.in).nextLine().split("\\.");

        if (Arrays.stream(temp).count() == 2)
            System.out.println(temp[0] + "\n" + temp[1]);
    }
}
