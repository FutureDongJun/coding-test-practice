package boj;

import java.util.Scanner;

public class Stars6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int p = n; p > 0; p--) {
            for (int o = p; o > 0; o--) {
                for (int i = 0; i < p; i++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
