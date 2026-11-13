package boj;

import java.util.Scanner;

public class Odd3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();

            if (t % 2 == 1 && t % 3 == 0) {
                sum += t;
            }
        }

        System.out.println(sum);
    }
}
