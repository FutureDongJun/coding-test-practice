package boj;

import java.util.Scanner;

public class Numbers28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ints = new int[10];

        for (int i = 0; i < 10; i++) {
            ints[i] = sc.nextInt();
        }

        int sum = ints[2] + ints[4] + ints[9];

        System.out.println(sum);
    }
}
