package boj;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        if (m >= 3 && m <= 5) {
            System.out.println("Spring");
        }

        if (m >= 6 && m <= 8) {
            System.out.println("Summer");
        }

        if (m >= 9 && m <= 11) {
            System.out.println("Fall");
        }

        if (m == 12 || (m >= 1 && m <= 2)) {
            System.out.println("Winter");
        }
    }
}
