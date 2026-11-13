package boj;

import java.util.Scanner;

public class rectangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rectangle = n * n;

        if (n < 5) {
            System.out.println(rectangle);
            System.out.println("tiny");
        } else {
            System.out.println(rectangle);
        }
    }
}
