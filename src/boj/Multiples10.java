package boj;

import java.util.Scanner;

public class Multiples10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int multi = 1;
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int j = a; j <= b; j++) {
                multi *= j;
            }

            System.out.println(multi);
        }
    }
}
