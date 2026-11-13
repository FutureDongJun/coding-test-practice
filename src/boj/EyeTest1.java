package boj;

import java.util.Scanner;

public class EyeTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double leftEye = sc.nextDouble();
        double rightEye = sc.nextDouble();

        if (leftEye >= 1.0) {
            if (rightEye >= 1.0) {
                System.out.println("High");
            } else if (rightEye >= 0.5) {
                System.out.println("Middle");
            } else {
                System.out.println("Low");
            }
        } else if (leftEye >= 0.5) {
            if (rightEye >= 0.5) {
                System.out.println("Middle");
            } else {
                System.out.println("Low");
            }
        } else {
            System.out.println("Low");
        }

        }
    }
