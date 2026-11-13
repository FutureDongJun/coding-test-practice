package boj;

import java.util.Scanner;

public class PhoneNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String phoneNumber = sc.next();
        String[] pn = phoneNumber.split("-");

        System.out.println(pn[0] + "-" + pn[2] + "-" + pn[1]);
    }
}
