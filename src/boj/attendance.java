package boj;

import java.util.Scanner;

public class attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int attendance = sc.nextInt();

        if (attendance == 1) {
            System.out.println("John");
        } else if (attendance == 2) {
            System.out.println("Tom");
        } else if (attendance == 3) {
            System.out.println("Paul");
        } else {
            System.out.println("Vacancy");
        }
    }
}
