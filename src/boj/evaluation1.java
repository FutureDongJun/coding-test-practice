package boj;

import java.util.Scanner;

public class evaluation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String alphabet = sc.next();
        if (alphabet.equals("S")) {
            System.out.println("Superior");
        } else if (alphabet.equals("A") ) {
            System.out.println("Excellent");
        } else if (alphabet.equals("B")) {
            System.out.println("Good");
        } else if (alphabet.equals("C")) {
            System.out.println("Usually");
        } else if (alphabet.equals("D")) {
            System.out.println("Effort");
        } else {
            System.out.println("Failure");
        }

    }
}
