import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {

            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }

            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                continue;
            }


            for (int j = n - i; j > 0 ; j--) {
                System.out.print("  ");
            }

            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}