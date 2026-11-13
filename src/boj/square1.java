package boj;

import java.util.Scanner;

public class square1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt() + 8;
        int height = sc.nextInt() * 3;

        System.out.println(width);
        System.out.println(height);
        System.out.println(width * height);
    }
}
