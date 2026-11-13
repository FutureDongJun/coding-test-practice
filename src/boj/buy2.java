package boj;

import java.util.Scanner;

public class buy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 3000) {
            System.out.println("book");
        } else if (n >= 1000) {
            System.out.println("mask");
        } else if (n >= 500) {
            System.out.println("pen");
        } else {
            System.out.println("no");
        }
    }
}
