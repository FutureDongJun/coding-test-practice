package boj;

import java.util.Scanner;

public class ASCII2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) cnt);
                if (cnt == 'Z') {
                    cnt = 'A';
                } else {
                    cnt++;
                }
            }
            System.out.println();
        }
    }
}
