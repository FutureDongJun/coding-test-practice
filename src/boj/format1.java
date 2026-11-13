package boj;

import java.util.Scanner;

public class format1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String[] t = s.split("-");

        System.out.println(t[2] + "." + t[0] + "." + t[1]);
    }
}
