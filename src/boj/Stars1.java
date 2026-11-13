package boj;

import java.util.Scanner;

public class Stars1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int a = 0; a < n; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
