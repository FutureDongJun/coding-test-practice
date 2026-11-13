package boj;

import java.util.Scanner;

public class Array17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Arr = new int[100];
        int[] arrCnt = new int[10];

        for (int i = 0; i < 100; i++) {
            Arr[i] = sc.nextInt();

            if (Arr[i] == 0) {
                break;
            }

            if (Arr[i] < 10) {
                continue;
            }

            for (int j = 1; j < 10; j++) {
                if (Arr[i] / 10 == j) {
                    arrCnt[j]++;
                }
            }
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(arrCnt[i]);
        }
    }
}
