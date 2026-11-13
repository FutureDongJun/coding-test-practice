package boj;

import java.util.Scanner;

public class output1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        String[] numSplit = num.split("-");

        for (String s : numSplit) {
            System.out.print(s);
        }

    }
}
