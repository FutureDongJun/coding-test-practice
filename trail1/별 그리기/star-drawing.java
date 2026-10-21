import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            if (i == n) {
                continue;
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 2 * i - 1; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}