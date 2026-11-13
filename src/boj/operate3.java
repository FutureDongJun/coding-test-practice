package boj;

import java.util.Scanner;

public class operate3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = a + b;
        double d = a - b;

        double e = Math.round(c / d * 100);
        System.out.printf("%.2f", e / 100);
    }
}
