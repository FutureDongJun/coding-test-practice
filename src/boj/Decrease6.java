package boj;

import java.util.Scanner;

public class Decrease6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n >= 1) {
            System.out.print(n + " ");
            n--;
        }
    }
}