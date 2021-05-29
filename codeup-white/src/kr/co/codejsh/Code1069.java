package kr.co.codejsh;

import java.util.Scanner;

public class Code1069 {

    public static void main(String[] args) {

        char inputAlphabet = new Scanner(System.in).nextLine().charAt(0);

        switch (inputAlphabet) {
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
                break;
        }
    }
}

