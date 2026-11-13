package boj;

import java.util.Scanner;

public class K201521 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int m = 0;
        int n = sc.nextInt();
        while (n != 1) {
            if(n % 2 == 0) n /= 2;
            else n = 3 * n + 1;

            if (n == 5) {
            }


            if (n == 5) {
                break;
            }
        }
        System.out.println(m);
    }
}
