package boj;

import java.util.Scanner;

public class Stars7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int o = 0; o < 2 * i - 1; o++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
