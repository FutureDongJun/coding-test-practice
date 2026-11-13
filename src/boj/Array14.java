package boj;

import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[10];
        int[] arrCnt = new int[10];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < 10; i++) {
            arrCnt[arr[i]]++;
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(arrCnt[i]);
        }
    }
}


