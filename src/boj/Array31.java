package boj;

import java.util.Scanner;

public class Array31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j % 2 == 0) {
                    arr[i][j] = (n * j) + i;
                } else if (j % 2 == 1) {
                    arr[i][j] = (n * (j + 1)) - i - 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
