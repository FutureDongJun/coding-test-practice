package boj;

import java.util.Scanner;

public class Numbers30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ints = new int[100];
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            ints[i] = sc.nextInt();

            if (ints[i] == 0) {
                sum = ints[i - 1] + ints[i - 2] + ints[i - 3];
                break;
            }
        }

        System.out.println(sum);
    }
}
