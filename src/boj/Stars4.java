package boj;

import java.util.Scanner;

public class Stars4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            for (int o = i; o > 0; o--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
