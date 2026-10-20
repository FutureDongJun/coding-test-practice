import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int o = 0; o < 2 * i - 1; o++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}