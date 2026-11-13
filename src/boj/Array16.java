package boj;

import java.util.Scanner;

public class Array16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arrCnt = new int[11];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            for (int j = 1; j < 7; j++) {
                if (arr[i] == j) {
                    arrCnt[j]++;
                }
            }
        }

        for (int i = 1; i < 7; i++) {
            System.out.print(arrCnt[i] + " ");
        }
    }
}
