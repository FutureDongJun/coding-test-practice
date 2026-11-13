package boj;

import java.util.Scanner;

public class Decrease3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = b; i >= a; i--) {
            System.out.print(i + " ");
        }
    }
}