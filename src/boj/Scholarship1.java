package boj;

import java.util.Scanner;

public class Scholarship1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int me = sc.nextInt();
        int fe = sc.nextInt();

        if (me >= 90) {
            if (fe >= 95) {
                System.out.println(100000);
            } else if (fe >= 90) {
                System.out.println(50000);
            }
        } else {
            System.out.println(0);
        }
    }
}
