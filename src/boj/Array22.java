package boj;

import java.util.Scanner;

public class Array22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] aArray = new int[n1];
        int[] bArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            aArray[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            bArray[i] = sc.nextInt();
        }

        boolean bool = true;

        for (int i = 0; i <= n1 - n2; i++) {
            if (aArray[i] == bArray[0]) {
                bool = true;
                for (int j = 0; j < n2; j++) {
                    if (aArray[i + j] == bArray[j]) {
                        continue;
                    } else {
                        bool = false;
                        break;
                    }
                }

                if (bool) {
                    break;
                } else {
                    continue;
                }

            } else {
                bool = false;
            }

        }


        if (bool) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
