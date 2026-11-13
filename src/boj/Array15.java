package boj;

import java.util.Scanner;

public class Array15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] cntArr = new int[10];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            for (int j = 1; j < 10; j++) {
                if (arr[i] == j) {
                    cntArr[arr[i]]++;
                }
            }
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(cntArr[i]);
        }
    }
}
