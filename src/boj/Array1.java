package boj;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Arr = new int[10];

        for (int i = 0; i < 10; i++) {
            Arr[i] = sc.nextInt();

            if (Arr[i] % 3 == 0) {
                System.out.print(Arr[i - 1]);
                break;
            }
        }
    }
}
