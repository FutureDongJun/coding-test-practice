package boj;

import java.util.Scanner;

public class Reach2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a <= b) {
            if (a % 2 == 1) {
                System.out.print(a + " ");
                a *= 2;
            } else if (a % 2 == 0) {
                System.out.print(a + " ");
                a += 3;
            }
        }
    }
}
