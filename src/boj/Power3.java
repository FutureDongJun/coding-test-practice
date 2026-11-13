package boj;

import java.util.Scanner;

public class Power3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        while (true) {
            if (n / 2 == 1) {
                cnt++;
                break;
            } else if (n / 2 != 1) {
                n = n / 2;
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
