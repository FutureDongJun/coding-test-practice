package boj;

import java.util.Scanner;

public class Power2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int power = 1;
        for (int i = 1; i <= b; i++) {
            if (i % a == 0) {
                power *= i;
            }
        }

        System.out.println(power);
    }
}
