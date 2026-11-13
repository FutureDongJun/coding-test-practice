package boj;

import java.util.Scanner;

public class comparison3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aMath = sc.nextInt();
        int aEnglish = sc.nextInt();

        int bMath = sc.nextInt();
        int bEnglish = sc.nextInt();

        System.out.println(aMath > bMath && aEnglish > bEnglish ? 1 : 0);
    }
}
