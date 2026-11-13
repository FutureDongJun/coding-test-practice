package boj;

import java.util.Scanner;

public class Triangle5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i >= j) {
                    System.out.print("  ");
                } else {
                    System.out.print(n - j + 1 + " ");
                }
            }

            System.out.println();
        }

    }
}
