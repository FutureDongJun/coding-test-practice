package boj;

import java.util.Scanner;

public class NegativeNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(n);
        if (n < 0) {
            System.out.println("minus");
        }
    }
}
