package boj;

import java.util.Scanner;

public class Stars3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < 2; i++) {
            for (int o = 0; o < n; o++) {
                for (int p = 0; p < n; p++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println();
        }
    }
}
