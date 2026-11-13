package boj;

import java.util.Scanner;

public class Numbers13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int power = 1;

        for (int i = 1; i <= 10; i++) {
            power *= i;

            if (power >= n) {
                System.out.println(i);
                break;
            }
        }
    }
}
