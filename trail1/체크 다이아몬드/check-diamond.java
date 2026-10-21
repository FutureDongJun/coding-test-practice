import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = n - i; j >= 0 ; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = n; i > 0; i--) {
            if (i == n) {
                continue;
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}