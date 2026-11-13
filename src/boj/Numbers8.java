package boj;

import java.util.Scanner;

public class Numbers8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        if (n != 1) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
        }

        if (n != 1) {
            if (n == sum) {
                System.out.println("P");
            } else {
                System.out.println("N");
        }

        }
    }
}
