package boj;

import java.util.Scanner;

public class EyeTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rn = sc.nextDouble();

        if (rn >= 1.0) {
            System.out.println("High");
        } else if (rn >= 0.5) {
            System.out.println("Middle");
        } else {
            System.out.println("Low");
        }

    }
}
