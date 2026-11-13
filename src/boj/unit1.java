package boj;

import java.util.Scanner;

public class unit1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ft = 30.48;
        double n = sc.nextDouble();

        System.out.printf("%.1f", ft * n);

    }
}
