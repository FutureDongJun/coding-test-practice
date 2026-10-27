import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i >= j) {
                    System.out.print("  ");
                } else {
                    System.out.print(n - j + 1 + " ");
                }
            }

            System.out.println();
        }
    }
}