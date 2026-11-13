package boj;

import java.util.Scanner;

public class output2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date = sc.next();

        String[] dateInput = date.split("\\.");

        String month = dateInput[1];
        String day = dateInput[2];
        String year = dateInput[0];

        System.out.print(month + " - " + day + " - " + year);
    }
}
