package boj;

import java.util.Scanner;

public class Rule1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int n = sc.nextInt();

        while (true) {
            if (n >= 1000) {
                break;
            }

            if (n % 2 == 0) {
                n = n * 3 + 1;
                cnt++;
            } else if (n % 2 == 1) {
                n = n * 2 + 2;
                cnt++;
            }

        }

        System.out.println(cnt);
    }
}
