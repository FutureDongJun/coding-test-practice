import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");
            }

            for (int j = n - i; j < n; j++) {
                System.out.print("@ ");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            if (i == n) {
                continue;
            }

            for (int j = i; j >= 1; j--) {
                System.out.print("@ ");
            }

            System.out.println();
        }
    }
}