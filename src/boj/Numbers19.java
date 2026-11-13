package boj;

import java.util.Scanner;

public class Numbers19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ints = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            ints[i] = sc.nextInt();
            sum += ints[i];
        }

        System.out.println(sum);
    }
}
