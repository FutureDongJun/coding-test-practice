package boj;

import java.util.Scanner;

public class Numbers14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 25) {
                System.out.println("Good");
                break;
            } else if (n < 25) {
                System.out.println("Higher");
            } else if (n > 25) {
                System.out.println("Lower");
            }
        }
    }
}
