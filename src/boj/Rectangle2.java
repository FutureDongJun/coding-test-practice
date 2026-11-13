package boj;

import java.util.Scanner;

public class Rectangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int width = sc.nextInt();
            int height = sc.nextInt();
            String c = sc.next();
            if (c.equals("C")) {
                System.out.println(width * height);
                break;
            } else {
                System.out.println(width * height);
            }
        }
    }
}
