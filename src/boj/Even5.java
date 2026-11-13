package boj;

import java.util.Scanner;

public class Even5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ints = new int[n];

        for (int i = 0; i < n; i++) {
            ints[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            if (ints[i] % 2 == 0) {
                System.out.print(ints[i] + " ");
            }
        }
    }
}
