package boj;

import java.util.Scanner;

public class letter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        String p;
        p = s;
        s = t;
        t = p;

        System.out.println(s);
        System.out.println(t);
    }
}
