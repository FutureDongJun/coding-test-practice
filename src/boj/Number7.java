package boj;

import java.util.Scanner;

public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > 0) {
            for (int i = 0; i < b; i++) {
                System.out.print(a);
            }
        } else if (a <= 0) {
            System.out.print(0);
        }
    }
}
